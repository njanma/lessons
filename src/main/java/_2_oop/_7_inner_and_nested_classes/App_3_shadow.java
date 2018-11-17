package _2_oop._7_inner_and_nested_classes;

public class App_3_shadow {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("App_3_shadow.this.x = " + App_3_shadow.this.x);
        }
    }

    public static void main(String... args) {
        App_3_shadow st = new App_3_shadow();
        App_3_shadow.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
