package _2_oop._2_constructor;

public class App_2_8_init_block {
    public static void main(String[] args) {
        new Children();

        Children children = new Children() {
            {
                name = "Vasia";
            }
        };
        System.out.println(children.age);
    }
}

class ParentInit {
    String name = "";

    static {
        System.err.println("parent static block");
    }

    {
        System.err.println("parent block");
    }

    public ParentInit() {
        System.err.println("parent constructor");
    }
}

class Children extends ParentInit {

    int age;

    static {
        System.err.println("children static block");
    }

    {
        System.err.println("children block");
        age = 9;
    }

    {
        System.err.println("2nd children block");
    }

    public Children() {
        System.err.println("children constructor");
    }
}
