package _5_exceptions;

public class App_23_throwChecked {

    public static void main(String[] args) {

//        throw new Exception();
        ExceptionUtils.sneakyThrow(new Exception());
    }
}