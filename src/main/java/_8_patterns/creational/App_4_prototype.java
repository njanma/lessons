package _8_patterns.creational;

import lombok.SneakyThrows;

/**
 * https://refactoring.guru/ru/design-patterns/prototype
 */
public class App_4_prototype {

    public static void main(String[] args) {
        new PersonCloneable().clone();
    }

    private static class PersonCloneable implements Cloneable {
        @Override
        @SneakyThrows(CloneNotSupportedException.class)
        public Object clone() {
            return super.clone();
        }
    }
}
