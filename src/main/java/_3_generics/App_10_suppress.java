package _3_generics;

import java.util.ArrayList;
import java.util.List;

public class App_10_suppress {
    public static void main(String[] args) {
        Object list = null;
        ArrayList<Integer> newList = (ArrayList<Integer>) list;
        @SuppressWarnings("unchecked") ArrayList<Integer> newList2 = (ArrayList<Integer>) list;
    }

    @SuppressWarnings("unchecked")
    private static List<Integer> uncheckedList() {
        return (ArrayList<Integer>) new ArrayList();
    }
}
