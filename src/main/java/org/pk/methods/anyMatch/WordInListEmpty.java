package org.pk.methods.anyMatch;

import java.util.Arrays;
import java.util.List;

public class WordInListEmpty {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "", "banana", "cherry");

        boolean result = words.stream().anyMatch(n -> n.isEmpty());
        System.out.println("Is there any empty string? " + result);
    }
}
