package org.pk.methods.count;

import java.util.Arrays;
import java.util.List;

public class CountUniqueWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "cherry", "date");
        long count = words.stream().distinct().count();
        System.out.println("The count the unique words : " + count);
    }
}
