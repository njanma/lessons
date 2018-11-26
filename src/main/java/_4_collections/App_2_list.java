package _4_collections;

import _4_collections.Utils.Employee;

import java.util.List;

import static java.util.Arrays.asList;

public class App_2_list {
    public static void main(String[] args) {
        List<Employee> employees = asList(new Employee("Mike"), new Employee("Bill"));

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.forEach(System.out::println);
    }
}
