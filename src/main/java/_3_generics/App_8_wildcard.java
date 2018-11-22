package _3_generics;

import _3_generics.Utils.Parent;

import java.util.ArrayList;

public class App_8_wildcard {
    public static void main(String[] args) {
        hasNulls(new ArrayList<Parent>(){{add(new Parent());}});
    }

    static boolean hasNulls(ArrayList<?> list) {
        for (Object elem : list) {
            if (elem == null)
                return true;
        }
        return false;
    }
}
