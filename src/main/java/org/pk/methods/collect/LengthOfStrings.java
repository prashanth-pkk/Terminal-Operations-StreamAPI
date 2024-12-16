package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfStrings {
    public static void main(String[] args) {
        String[] words = {"Banana", "Apple", "orange", "pineapple", "grapes"};
        List<String> list = Arrays.asList(words);

        //Length of the Strings by using groupingBy()
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("The length of the words : " + map);

        //map() method
        List<Integer> k = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Length of the words : " + k);
    }
}
