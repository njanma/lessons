package by.itacademy.dao;

import by.itacademy.exception.DaoException;
import by.itacademy.model.Request;
import by.itacademy.util.ConnectionManager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RequestDao {

    private static final RequestDao INSTANCE = new RequestDao();
    private static final String SAVE = "INSERT INTO request (description, date) VALUES (?, ?)";

    public Request save(Request request) {
        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE, RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, request.getDescription());
            preparedStatement.setDate(2, Date.valueOf(request.getDate()));

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                request.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return request;
    }

    public static RequestDao getInstance() {
        return INSTANCE;
    }
}
