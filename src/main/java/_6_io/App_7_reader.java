package _6_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App_7_reader {
    public static void main(String[] args) throws IOException {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(in.readLine());
            System.out.println(in.lines());
        }

        Scanner in = new Scanner(System.in, "UTF-8 ");
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
        }
    }

}
