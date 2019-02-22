package _6_io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App_8_reader {
    public static void main(String[] args) throws IOException {
        InputStreamReader in1 = new InputStreamReader(System.in);
        try (BufferedReader in = new BufferedReader(in1)) {
            char i = (char) in1.read();
            System.out.println(in.readLine());
            System.out.println(in.lines());
        }

        Scanner in = new Scanner(System.in, "UTF-8");
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
        }
    }

}
