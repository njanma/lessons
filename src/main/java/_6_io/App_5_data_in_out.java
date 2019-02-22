package _6_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TODO: java.io.DataOutput
 */
public class App_5_data_in_out {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(Utils.RESOURCES + "\\file3.txt");
        try (DataOutputStream dataOutputStream = new DataOutputStream(fos)) {
            dataOutputStream.writeDouble(2.178);
            dataOutputStream.writeChars("Hell");
        }

        FileInputStream fs = new FileInputStream(Utils.RESOURCES + "\\file3.txt");
        try (DataInputStream in = new DataInputStream(fs)) {
            System.out.println(in.readDouble());
            System.out.println(in.readChar());
        }
    }
}