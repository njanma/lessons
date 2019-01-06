package _1_procedural;

public class App_1_1_logic_op {
    public static void main(String[] args) {
        if (isTrue() | isTrue())
            System.exit(0);
    }

    static boolean isTrue() {
        System.out.println("isTrue?");
        return true;
    }
}
