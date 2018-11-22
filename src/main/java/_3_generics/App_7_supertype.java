package _3_generics;

import _3_generics.Utils.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App_7_supertype {
    public static void main(String[] args) {
        ArrayList<Parent> parents = new ArrayList<>();
        parents.add(new Parent());

        Predicate<Object> objectPredicate = p -> p.hashCode() != 0;
        Predicate<Parent> parentPredicate = p -> p.getChildren().size()!= 0;

        printAll(parents, parentPredicate);
    }

    static void printAll(List<Parent> parents, Predicate<Parent> filter) {
        for (Parent parent : parents) {
            if (filter.test(parent)) {
                System.out.println(parent.getChildren().size());
            }
        }
    }
}
