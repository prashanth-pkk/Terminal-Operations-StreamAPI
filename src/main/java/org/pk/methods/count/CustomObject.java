package org.pk.methods.count;

import java.util.Arrays;
import java.util.List;

public class CustomObject {
    public static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        public String toString() {
            return name + " " + grade;
        }

        public static void main(String[] args) {
            List<Student> studentList = Arrays.asList(
                    new Student("Alice", 85),
                    new Student("Bob", 92),
                    new Student("Charlie", 78),
                    new Student("David", 92),
                    new Student("Eve", 90)
            );
            long count = studentList.stream().filter(s -> s.getGrade() >= 90).
                    count();
            System.out.println("Number of students with grade 90 : " + count);
        }
    }
}
