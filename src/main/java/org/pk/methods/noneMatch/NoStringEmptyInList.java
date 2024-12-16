package org.pk.methods.noneMatch;

import java.util.Arrays;
import java.util.List;

public class NoStringEmptyInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        boolean result = words.stream().noneMatch(n -> n.isEmpty());
        System.out.println("Is the empty string available : " + result);
    }
}
