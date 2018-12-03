package _6_io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class App_3_out {
    public static void main(String[] args) throws Exception {
        writeToMemory(new ByteArrayOutputStream(16));
        writeToFile(new FileOutputStream(Utils.RESOURCES + "\\file1.txt"));
    }

    static void writeToMemory(final ByteArrayOutputStream out) throws IOException {
        try {
            out.write(0);
            out.write(new byte[]{1, 2});
            out.write(new byte[]{0, 0, 3, 4, 5, 0, 0}, 2, 3);
            out.flush();
        } finally {
            out.close();
        }

        byte[] array = out.toByteArray();
        System.out.println(Arrays.toString(array));
    }

    static void writeToFile(final FileOutputStream out) throws IOException {
        try {
            out.write(0);
            out.write(new byte[]{1, 2});
            out.write(new byte[]{0, 0, 3, 4, 5, 0, 0}, 2, 3);
        } finally {
            try {
                out.flush();
            } catch (IOException ignore) {
            }
            try {
                out.close();
            } catch (IOException ignore) {
            }
        }
    }
}