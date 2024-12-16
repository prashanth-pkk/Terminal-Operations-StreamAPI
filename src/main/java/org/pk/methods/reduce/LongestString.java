package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        int maxLength = list.stream().reduce(0, (max, s) -> Math.max(max, s.length()), Integer::max);
        System.out.println("The length of the String : " + maxLength);

    }
}
