package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream().filter(n -> n % 2 != 0).reduce(0, Integer::sum);
        System.out.println("Sum of odd numbers : " + sum);
    }
}
