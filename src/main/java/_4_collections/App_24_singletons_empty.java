package _4_collections;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class App_24_singletons_empty {
    public static void main(String[] args) {
        List<Integer> emptyList = Collections.emptyList();
        Set<Integer> zero = Collections.singleton(0);
        List<Integer> fst = Collections.singletonList(1);

        List<Integer> emptyUnmodifiable = Collections.unmodifiableList(emptyList);
    }
}
