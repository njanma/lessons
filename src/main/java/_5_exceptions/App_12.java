package _5_exceptions;

/**
 * нельзя ставить потомка после предка! (RuntimeException после Exception)
 */
public class App_12 {
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
//            COMPILATION ERROR: Exception 'java.lang.RuntimeException' has already been caught
//        } catch (RuntimeException e) {
        }
    }
}
