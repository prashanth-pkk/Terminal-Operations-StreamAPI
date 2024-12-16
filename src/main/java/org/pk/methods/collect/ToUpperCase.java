package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "tomato", "pineapple", "potato", "liver");
        List<String> values = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("To convert upper case : " + values);
    }
}
