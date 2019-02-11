package _4_collections;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

public class Utils {
    private Utils() {
    }

    public static <E> void timerOnAction(List<E> list, Consumer<List<E>> action) {
        timerOnAction(list, action, list.size());
    }


    public static <E> void timerOnAction(List<E> list, Consumer<List<E>> action, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            action.accept(list);
        }
        long finish = System.currentTimeMillis();

        System.out.println("Spent time: " + (finish - start));
    }


    public static <E> void fillList(List<E> list, E elem, int size) {
        for (int i = 0; i < size; i++) {
            list.add(elem);
        }
    }

    //-------------------------------------------------------------------------------------

    public static class Employee {
        private final String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class Company implements Iterable<Employee> {
        final Employee[] employees;

        public Company(Employee[] employees) {
            this.employees = employees;
        }


        public Employee getEmplyee(int idx) {
            if (idx >= employees.length || idx < 0)
                throw new IllegalArgumentException();
            return employees[idx];
        }

        public int numberOfEmployees() {
            return employees.length;
        }

        @Override
        public Iterator<Employee> iterator() {
            return new EmployeeIterator();
        }

        private class EmployeeIterator implements Iterator<Employee> {
            int cursor;

            private EmployeeIterator() {
            }

            @Override
            public boolean hasNext() {
                return cursor != employees.length;
            }

            @Override
            public Employee next() {
                int i = cursor++;
                if (i >= employees.length)
                    throw new NoSuchElementException();
                return employees[i];
            }
        }
    }

    public static class Node {
        String name;
        int id;

        public Node(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            System.err.println("equals on " + id);
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    //-------------------------------------------------------------------------------------
}
