package _8_java8;

import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.BinaryOperator;

public class App_1_lambda {

    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("Hello World");

        ActionListener oneArgument = event -> System.out.println("button clicked" + event.getWhen());

        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };

        Callable<Integer> call = () -> {
            System.out.println("");
            Thread.sleep(1000);
            return new Random().nextInt();
        };

        BinaryOperator<Long> add = Long::sum;

        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }
}
