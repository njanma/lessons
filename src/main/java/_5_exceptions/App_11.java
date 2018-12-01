package _5_exceptions;

public class App_11 {
    public static void main(String[] args) {
        try {
            System.err.println(" 0");
            if (true) {throw new RuntimeException();}
            System.err.println(" 1");
        } catch (RuntimeException e) {         // перехватили RuntimeException
            System.err.println(" 2.1");
            try {
                System.err.println(" 2.2");
                if (true) {throw new Error();} // и бросили новый Error
                System.err.println(" 2.3");
            } catch (Throwable t) {            // перехватили Error
                System.err.println(" 2.4");
            }
            System.err.println(" 2.5");
        } catch (Error e) {                    // хотя есть catch по Error "ниже", но мы в него не попадаем
            System.err.println(" 3");
        }
        System.err.println(" 4");
    }
}
