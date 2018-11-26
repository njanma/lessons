package _3_generics;

import _3_generics.Utils.Employee;
import _3_generics.Utils.Manager;

public class App_4_arrays_covariant {
    public static void main(String[] args) {
        Manager[] managers = new Manager[10];
        Employee[] employees = managers;
        employees[0] = new Employee();
    }
}