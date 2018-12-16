package _8_patterns.creational;

import lombok.Builder;

/**
 * https://refactoring.guru/ru/design-patterns/builder
 */
public class App_3_builder {

    public static void main(String[] args) {
        new java.lang.StringBuilder().append(0);
        new java.lang.StringBuffer().append(0);
        java.util.stream.Stream.builder();
    }

    @Builder
    private static class Person {
        private String name;
        private Integer age;
    }
}
