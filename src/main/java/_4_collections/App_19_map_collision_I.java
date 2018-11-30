package _4_collections;

import _4_collections.Utils.Node;

import java.util.HashMap;
import java.util.Objects;

public class App_19_map_collision_I {
    public static void main(String[] args) {
        HashMap<Node, Integer> map = new HashMap<>();

        map.put(new Node("One",1), null);
        map.put(new Node("One",2), null);
        map.put(new Node("One",3), null);

        System.err.println(map);

//        System.err.println(map.get(new Node("One",4)));
    }


}
