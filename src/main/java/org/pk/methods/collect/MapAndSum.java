package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;

public class MapAndSum {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "mango");
        int sum = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Sum of the all elements : " + sum);
    }
}
