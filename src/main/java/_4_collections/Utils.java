package _4_collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Utils {
    private Utils() {
    }

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
}
