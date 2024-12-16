package org.pk.methods.forEach;

import java.util.Arrays;
import java.util.List;

public class CustomObject {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("John", 25)
                , new Person("Jane", 30), new Person("Nidhi", 30));

        personList.stream().forEach(person -> System.out.println(person));
    }
}

