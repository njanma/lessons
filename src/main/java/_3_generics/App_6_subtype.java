package _3_generics;

import _3_generics.Utils.Child;
import _3_generics.Utils.Grandparent;
import _3_generics.Utils.Parent;

import java.util.ArrayList;

public class App_6_subtype {
    public static void main(String[] args) {

        ArrayList<Grandparent> grandparents = new ArrayList<>();
        ArrayList<Parent> parents = new ArrayList<>();
        ArrayList<Child> children = new ArrayList<>();

//        doSomething(grandparents);
//        doSomething(parents);
//        doSomething(children);
    }

    private static void doSomething(ArrayList<? extends Parent> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }

    }
}
