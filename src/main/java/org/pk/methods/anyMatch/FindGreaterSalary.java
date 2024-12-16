package org.pk.methods.anyMatch;

import java.util.Arrays;
import java.util.List;

public class FindGreaterSalary {
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
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 75000),
                new Employee("Alex", 60000)
        );
        boolean result = employees.stream().anyMatch(emp -> emp.getSalary() > 60000);
        System.out.println("Is the result satisfied given condition : " + result);
    }
}
