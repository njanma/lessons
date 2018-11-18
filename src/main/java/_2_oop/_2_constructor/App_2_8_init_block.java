package _2_oop._2_constructor;

public class App_2_8_init_block {
    public static void main(String[] args) {
        new Children();
    }
}

class ParentInit{

    public ParentInit() {
        System.err.println("parent constructor");
    }

    {
        System.err.println("parent block");
    }

    static {
        System.err.println("parent static block");
    }
}

class Children extends ParentInit{

    public Children() {
        System.err.println("children constructor");
    }

    {
        System.err.println("children block");
    }

    static {
        System.err.println("children static block");
    }
}
