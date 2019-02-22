package _5_exceptions.exception;

public class DataValidationException extends RuntimeException {

    public static void main(String[] args) throws DataValidationException {
        throw new DataValidationException();
    }
}
