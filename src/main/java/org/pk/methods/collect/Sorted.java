package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 11, 5, 9, 4);
        List<Integer> numbers = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
