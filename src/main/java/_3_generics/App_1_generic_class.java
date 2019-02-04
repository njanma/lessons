package _3_generics;

public class App_1_generic_class {
    public static void main(String[] args) {
        new Entry<>("age", 2);
    }
}

class Entry<K, V> {
    private K key;
    private V value;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

