package _4_collections;

import java.io.ByteArrayInputStream;

import static _4_collections.iterator.Utils.inputStreamReader;

/**
 * Task: InputStream to Iterable
 */
public class App_8_input_stream {

    public static void main(String[] args) {

        for (Integer i : inputStreamReader(new ByteArrayInputStream(new byte[0])))
            System.out.print(i + " ");

        for (Integer i : inputStreamReader(new ByteArrayInputStream(new byte[]{1, 2, 3})))
            System.out.print(i + " ");
    }
}
