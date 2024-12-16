package org.pk.methods.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortBasedOnAge {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Alice", 30),
                new Person("bob", 33),
                new Person("william", 21)
        );
        Map<Integer, List<Person>> map = personList.stream()
                .collect(Collectors.groupingBy(p -> p.age));
        System.out.println(map);

        Map<Integer, List<Person>> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("Sorted map by age:");
        sortedMap.forEach((age, people) -> {
            System.out.println("Age: " + age + " => " + people);
        });
    }
}


