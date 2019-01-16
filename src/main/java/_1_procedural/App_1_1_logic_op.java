package _1_procedural;

public class App_1_1_logic_op {
    public static void main(String[] args) {
        //eager
        print(isTrue() | isFalse());  // isTrue isFalse == true
        print(isTrue() & isFalse());  // isTrue isFalse == false
        print(isFalse() & isFalse()); // isFalse isFalse == false
        //lazy
        print(isTrue() || isFalse());  // isTrue == true
        print(isFalse() && isFalse()); // isFalse == false
    }

    static boolean isTrue() {
        System.out.print("isTrue ");
        return true;
    }

    static boolean isFalse() {
        System.out.print("isFalse ");
        return false;
    }

    static void print(boolean expression) {
        System.out.println("== " + expression);
    }
}
