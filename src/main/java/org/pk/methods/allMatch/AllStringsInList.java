package org.pk.methods.allMatch;

import java.util.Arrays;
import java.util.List;

public class AllStringsInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        boolean result = words.stream().allMatch(n -> n.isEmpty());
        System.out.println("All the elements in the stream : " + result);
    }
}
