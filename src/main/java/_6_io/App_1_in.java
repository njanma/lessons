package _6_io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App_1_in {
    public static void main(String[] args) throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[]{0, 1, 2, 3, 4, 5, 6, 7});
        BufferedInputStream in2 = new BufferedInputStream(in);
        // read one byte
        int oneByte = in.read();
        System.out.println("(1): " + oneByte);

        // read full array
        byte[] limitedBuffer = new byte[2];
        int sizeReadBytes = in.read(limitedBuffer);
        System.out.println("(" + sizeReadBytes + "): " + Arrays.toString(limitedBuffer));

        // read interval in array
        byte[] unlimBuffer = new byte[10];
        int sizeReadBytesUnlim = in.read(unlimBuffer, 0, 8);
        System.out.println("(" + sizeReadBytesUnlim + "): " + Arrays.toString(unlimBuffer));

        // nothing to read
        System.out.println(in.read());
        System.out.println(in.read(new byte[10]));
        System.out.println(in.read(new byte[10], 5, 2));

        try(InputStreamReader is = new InputStreamReader(new ByteArrayInputStream(new byte[]{}))){
            is.read();
        }
    }
}
