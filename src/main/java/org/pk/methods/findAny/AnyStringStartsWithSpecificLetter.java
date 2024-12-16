package org.pk.methods.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyStringStartsWithSpecificLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");
        Optional<String> result = words.stream()
                .filter(n -> n.startsWith("p"))
                .findAny();
        System.out.println("The String starts with specific letter : " + result);
    }
}
