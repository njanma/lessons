package by.itacademy.dao;

import by.itacademy.exception.DaoException;
import by.itacademy.model.Dish;
import by.itacademy.util.ConnectionManager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DishDao {

    private static final DishDao INSTANCE = new DishDao();
    private static final String SAVE = "INSERT INTO dish (name) VALUES (?);";
    private static final String GET_BY_ID = "SELECT id, name FROM dish WHERE id = ?";
    private static final String DELETE_RESTAURANT_DISH = "DELETE FROM restaurant_dish WHERE dish_id = ?";
    private static final String DELETE_DISH = "DELETE FROM dish WHERE id = ?";
    private static final String GET_ALL = "SELECT id, name FROM dish";

    public List<Dish> getAll() {
        List<Dish> dishes = new ArrayList<>();
        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                dishes.add(Dish.builder()
                        .id(resultSet.getLong("id"))
                        .name(resultSet.getString("name"))
                        .build());
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return dishes;
    }

    public boolean delete(Dish dish) {
        boolean result = false;
        Connection connection = null;
        PreparedStatement restaurantDishPs = null;
        PreparedStatement dishPs = null;
        try {
            connection = ConnectionManager.get();
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);

            restaurantDishPs = connection.prepareStatement(DELETE_RESTAURANT_DISH);
            restaurantDishPs.setLong(1, dish.getId());
            restaurantDishPs.executeUpdate();

            dishPs = connection.prepareStatement(DELETE_DISH);
            dishPs.setLong(1, dish.getId());
            dishPs.executeUpdate();

            connection.commit();
            result = true;
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException e1) {
                throw new DaoException(e1);
            }
            throw new DaoException(e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (restaurantDishPs != null) {
                    restaurantDishPs.close();
                }
                if (dishPs != null) {
                    dishPs.close();
                }
            } catch (SQLException e) {
                throw new DaoException(e);
            }
        }

        return result;
    }

    public Optional<Dish> getById(Long id) {
        Dish dish = null;
        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                dish = Dish.builder()
                        .id(resultSet.getLong("id"))
                        .name(resultSet.getString("name"))
                        .build();
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return Optional.ofNullable(dish);
    }

    public Long save(@NonNull Dish dish) {
        Long id = null;
        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, dish.getName());
            preparedStatement.executeUpdate();

            ResultSet keys = preparedStatement.getGeneratedKeys();
            if (keys.next()) {
                id = keys.getLong(1);
                dish.setId(id);
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return id;
    }

    public static DishDao getInstance() {
        return INSTANCE;
    }
}
