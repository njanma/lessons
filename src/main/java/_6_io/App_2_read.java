package _6_io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class App_2_read {
    public static void main(String[] args) throws Exception {
        byte[] bytes = {0, 1, 2, 3, 4, 5, 6, 7};

        readBytesWhileTrue(new ByteArrayInputStream(bytes));
//        readBytesWhileGteZero(new ByteArrayInputStream(bytes));
//        readBytesInBuffer(new ByteArrayInputStream(bytes));
    }

    static void readBytesWhileTrue(InputStream in) throws Exception {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print(" " + oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    static void readBytesWhileGteZero(InputStream in) throws Exception {
        int oneByte;
        while ((oneByte = in.read()) >= 0) {
            System.out.print(" " + oneByte);
        }
    }

    static void readBytesInBuffer(InputStream in) throws Exception {
        byte[] buff = new byte[3];
        int count;
        while ((count = in.read(buff)) != -1) {
            System.out.println("count " + count + ": " + Arrays.toString(buff));
        }
    }
}
