package _5_exceptions;

public class App_9_frames_IV {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");//last line in frame
        }
    }
}
