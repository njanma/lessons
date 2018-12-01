package _5_exceptions;

/**
 * \                    Object
 * \                      |
 * \                  Throwable
 * \                  /      \
 * \              Error     Exception
 * \                            |
 * \                    RuntimeException
 */
public class App_1 {
    public static void main(String[] args) throws Throwable {
        try {
//            throw new RuntimeException();
//            throw new Error();
//            throw null;
        } catch (RuntimeException runtime) {
            System.out.println("Runtime exception catch");
            System.out.println(runtime);
        } catch (Exception ex) {
            System.out.println("Exception catch");
            System.out.println(ex);
        } catch (Throwable throwable) {
            System.out.println("Throwable catch");
            System.out.println(throwable);
        } finally {
            System.out.println("finally block!!!!!!!!");
        }
    }
}
