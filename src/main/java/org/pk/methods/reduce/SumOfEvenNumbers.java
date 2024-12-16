package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
        int sum = list.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Sum of even numbers : " + sum);
    }
}
