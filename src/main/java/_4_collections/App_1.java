package _4_collections;

import _4_collections.Utils.Company;
import _4_collections.Utils.Employee;

public class App_1 {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Mike"), new Employee("Bill")};
        Company company = new Company(employees);


        for (int i = 0; i < company.numberOfEmployees(); i++)
            company.getEmplyee(i);


//        for (Employee employee : company)
//            System.out.println(employee);


//        for (Iterator<Employee> iterator = company.iterator(); iterator.hasNext(); )
//            System.out.println(iterator.next());
    }
}
