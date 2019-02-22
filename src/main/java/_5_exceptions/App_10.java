package _5_exceptions;

public class App_10 {
    public static void main(String[] args) {
        try {
            System.err.println(" 0");
            if (true) {throw new RuntimeException();}
            System.err.println(" 1");
        } catch (RuntimeException e) {     // перехватили RuntimeException
            System.err.println(" 2");
            if (true) {throw new Error();} // и бросили новый Error
        } catch (Error e) {                // хотя есть catch по Error "ниже", но мы в него не попадаем
            System.err.println(" 3");
        }
        System.err.println(" 4");
    }
}
