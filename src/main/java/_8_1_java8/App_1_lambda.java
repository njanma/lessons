package _8_1_java8;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class App_1_lambda {

    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("Hello World");

        ActionListener oneArgument = event -> System.out.println("button clicked");
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };
        BinaryOperator<Long> add = (x, y) -> x + y;

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }
}
