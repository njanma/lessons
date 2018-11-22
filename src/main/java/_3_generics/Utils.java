package _3_generics;

import java.util.ArrayList;

public final class Utils {
    private Utils() {
    }

    public static class Grandparent {
        public int getAge(){
            return 99;
        }
    }
    public static class Parent extends Grandparent {
        ArrayList<Child> getChildren(){
            return new ArrayList<>();
        }

        @Override
        protected Object clone() {
            throw new IllegalArgumentException();
        }
    }
    public static class Child extends Parent {
        Parent getParent(){
            return new Parent();
        }
    }


    public static class Employee {
        int getSalary(){
            return 15;
        }
    }
    public static class Manager extends Employee {}
}
