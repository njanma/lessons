package _3_generics;

import _3_generics.Utils.Child;
import _3_generics.Utils.Grandparent;
import _3_generics.Utils.Parent;

import java.util.ArrayList;

public class App_5 {
    public static void main(String[] args) {
        ArrayList<Child> children = new ArrayList<Child>();
        ArrayList<Parent> parents = new ArrayList<Parent>();
//        ArrayList<Parent> childrenInParents = new ArrayList<Child>();
//        ArrayList<Parent> parents = children;

        ArrayList<? extends Parent> covariantChildren = new ArrayList<Child>();
        ArrayList<? super Parent> contravariantChildren = new ArrayList<Grandparent>();
    }
}

