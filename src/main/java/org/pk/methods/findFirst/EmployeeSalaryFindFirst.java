package org.pk.methods.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeSalaryFindFirst {
    public static class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public String toString() {
            return name + " " + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", 45000),
                new Employee("Jane", 75000),
                new Employee("Alex", 60000)
        );
        Optional<Employee> result = employeeList.stream()
                .filter(n -> n.getSalary() > 50000)
                .findFirst();
        System.out.println("First employee with salary greater than 50,000: " + result);
    }
}
