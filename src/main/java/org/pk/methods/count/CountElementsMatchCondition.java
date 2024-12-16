package org.pk.methods.count;

import java.util.Arrays;
import java.util.List;

public class CountElementsMatchCondition {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pineapple", "cherry");
        long k = words.stream().filter(n -> n.length() > 5).count();
        System.out.println("The length of string : " + k);
    }
}
