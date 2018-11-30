package _4_collections;

import _4_collections.Utils.Node;

import java.util.HashMap;
import java.util.Map;

public class App_20_map_collision_II {
    public static void main(String[] args) {
        Map<Node, Object> nodes = new HashMap<>();

        Node snd = new Node("Two", 5);

        nodes.put(null, snd);
        nodes.put(null, snd);
        System.out.println(nodes);

//        nodes.put(snd, null);
//        nodes.put(snd, null);
//        System.out.println(nodes);
    }
}
