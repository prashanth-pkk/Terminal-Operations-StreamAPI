package org.pk.methods.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CustomObject {
    public static class Employee {
        String name;
        int age;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Jen", 30),
                new Employee("Bob", 25),
                new Employee("Charlie", 35)
        );
        Optional<Employee> youngest = employeeList.stream().min((s1, s2) -> Integer.compare(s1.age, s2.age));
        System.out.println("The youngest : " + youngest);
    }
}
