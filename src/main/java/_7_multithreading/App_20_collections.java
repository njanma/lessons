package _7_multithreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * https://en.wikipedia.org/wiki/Skip_list
 */
public class App_20_collections {
    public static void main(String[] args) {

        //synchronized wrappers
        Collection<Object> synchronizedCollection = Collections.synchronizedCollection(new ArrayList<>());
        Map<Object, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        //CopyOnWrite collections
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

        //concurrent maps
        ConcurrentMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentNavigableMap<String, Object> concurrentSkipListMap = new ConcurrentSkipListMap<>();

        //concurrent sets
        Set<String> concurrentSet = ConcurrentHashMap.newKeySet(1);
        NavigableSet<String> skipListSet = new ConcurrentSkipListSet<>();
    }
}
