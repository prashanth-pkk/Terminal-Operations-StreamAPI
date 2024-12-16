package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        long sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum of the numbers : " + sum);
    }
}
