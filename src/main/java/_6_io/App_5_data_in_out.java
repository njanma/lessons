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
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(Utils.RESOURCES + "\\file3.txt"))) {
            dataOutputStream.writeDouble(2.178);
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream(Utils.RESOURCES + "\\file3.txt"))) {
            System.out.println(in.readDouble());
        }
    }
}