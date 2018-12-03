package _6_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * TODO: java.lang.AutoCloseable
 */
public class App_4_close {

    public static void main(String[] args) throws Exception {

        withFinallyClose();
        tryWithResources();
    }

    static final void withFinallyClose() throws IOException {
        OutputStream out = new FileOutputStream(Utils.RESOURCES + "\\file2.txt");
        try {
            out.write(new byte[]{'H', 'e', 'l', 'l', 'o', '!'});
            out.flush();
        } finally {
            out.close();
        }

        InputStream in = new FileInputStream(Utils.RESOURCES + "\\file2.txt");
        try {
            int ch;
            while ((ch = in.read()) >= 0) {
                System.out.print((char) ch);
            }
        } finally {
            in.close();
        }
    }

    static final void tryWithResources() throws IOException {

        try (OutputStream out = new FileOutputStream(Utils.RESOURCES + "\\file3.txt")) {
            out.write(new byte[]{'H', 'e', 'l', 'l', 'o', '!'});
            out.flush();
        }

        try (InputStream in = new FileInputStream(Utils.RESOURCES + "\\file3.txt")) {
            int ch;
            while ((ch = in.read()) >= 0) {
                System.out.print((char) ch);
            }
        }
    }
}
