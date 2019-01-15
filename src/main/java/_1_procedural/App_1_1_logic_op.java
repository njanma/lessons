package _1_procedural;

public class App_1_1_logic_op {
    public static void main(String[] args) {
        //eager
        print(isTrue() | isFalse());  // true false == true
        print(isTrue() & isFalse());  // true false == false
        print(isFalse() & isFalse()); // false false == false
        //lazy
        print(isTrue() || isFalse());  // true == true
        print(isFalse() && isFalse()); // false == false
    }

    static boolean isTrue() {
        System.out.print("true ");
        return true;
    }

    static boolean isFalse() {
        System.out.print("false ");
        return true;
    }

    static void print(boolean expression) {
        System.out.println("== " + expression);
    }
}
