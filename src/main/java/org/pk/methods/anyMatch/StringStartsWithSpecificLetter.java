package org.pk.methods.anyMatch;

import java.util.Arrays;
import java.util.List;

public class StringStartsWithSpecificLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apricot");

        long result = words.stream().filter(n -> n.startsWith("a")).count();
        System.out.println("The number of words starts with a : " + result);
    }
}
