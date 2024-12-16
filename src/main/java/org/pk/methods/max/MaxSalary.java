package org.pk.methods.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxSalary {
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
                new Employee("John", 50000),
                new Employee("Jane", 75000),
                new Employee("Alex", 60000),
                new Employee("Sophia", 80000)
        );
        Optional<Employee> highestSalary = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getSalary));
        System.out.println("The highest salary : " + highestSalary);

        //OR

        Optional<Employee> highestSalary1 = employeeList.stream()
                .max((s1, s2) -> Integer.compare(s1.salary, s2.salary));
        System.out.println("The highest salary : " + highestSalary1);
    }
}
