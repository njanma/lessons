package _5_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App_18_try_with_resources {


    static void beforeJava7() {
        InputStream input = null;
        try {
            input = new FileInputStream("file");
            // some code
        } catch (FileNotFoundException ignore) {
        } finally {
            try {
                input.close();
            } catch (IOException ignore) {
            }
        }
    }

    static void afterJava7() throws IOException {
        try(InputStream in = new FileInputStream("file")){
            // some code
        }
    }
}
