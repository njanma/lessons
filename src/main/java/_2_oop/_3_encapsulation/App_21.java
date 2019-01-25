package _2_oop._3_encapsulation;

public class App_21 {
    public static void main(String[] args) {
        SecuredFred securedFred = new SecuredFred(45);
        securedFred.setAge(15);
        System.out.println(securedFred.getAge());
    }
}

class SecuredFred {

    private int age;

    public SecuredFred(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age) {
            this.age = age;
        }
    }
}
