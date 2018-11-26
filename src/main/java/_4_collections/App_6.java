package _4_collections;

import static _4_collections.iterator.Utils.squares;

public class App_6 {
    public static void main(String[] args) {

        for (Integer i : squares(1, 130))
            System.out.println(i);
    }
}
