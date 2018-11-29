package _4_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static _4_collections.Utils.fillList;

public class App_11_array_vs_linked_speed {

    public static void main(String[] args) {
        int size = 10_000;
        List<String> array = new ArrayList<>();
        List<String> linked = new LinkedList<>();
        fillList(array, "", size);
        fillList(linked, "", size);

        //contains
//        timerOnAction(array, s -> s.contains("abracadabra"));
//        timerOnAction(linked, s -> s.contains("abracadabra"));

        //first
//        timerOnAction(array, s -> s.get(0));
//        timerOnAction(linked, s -> s.get(0));
        //last
//        timerOnAction(array, s -> s.get(s.size() - 1));
//        timerOnAction(linked, s -> s.get(s.size() - 1));
        //middle
//        timerOnAction(array, s -> s.get(s.size() / 2));
//        timerOnAction(linked, s -> s.get(s.size() / 2));
        //prepend
//        timerOnAction(new ArrayList<String>(), s -> s.add(0, ""), 100_000);
//        timerOnAction(new LinkedList<String>(), s -> s.add(0, ""), 100_000);
        //insert in the middle
//        timerOnAction(array, s -> s.add(s.size() / 2, ""), 10_000);
//        timerOnAction(linked, s -> s.add(s.size() / 2, ""), 10_000);
    }


}
