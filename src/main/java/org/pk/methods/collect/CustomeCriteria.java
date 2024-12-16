package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomeCriteria {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "mango", "pineapple", "grapes");
        Map<Boolean, List<String>> map = list.stream()
                .collect(Collectors.partitioningBy(w -> w.length() > 5));
        System.out.println("Is the given condition is satisfied : " + map);
    }
}
