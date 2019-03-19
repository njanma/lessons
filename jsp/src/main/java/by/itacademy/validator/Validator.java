package by.itacademy.validator;

public interface Validator<T> {

    boolean isValid(T object);
}
