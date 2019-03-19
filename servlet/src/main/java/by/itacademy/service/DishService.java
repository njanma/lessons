package by.itacademy.service;

import by.itacademy.dao.DishDao;
import by.itacademy.model.Dish;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DishService {

    private static final DishService INSTANCE = new DishService();

    public List<Dish> getAll() {
        return DishDao.getInstance().getAll();
    }

    public static DishService getInstance() {
        return INSTANCE;
    }
}
