package _2_oop._8_local_and_anonymous_class;

public class App_3 {
    public static void main(String[] args) {
        IAnonymous ianonymous = new IAnonymous() {
            @Override
            public void exec() {
                System.out.println("iInterface!");
            }
        };
        ianonymous.doExecute();
    }

}

interface IAnonymous {

    void exec();

    default void doExecute() {
        exec();
    }
}
