package org.pk.methods.forEach;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int[] sum = {0};
        numbers.forEach(num -> {
            if (num % 2 != 0) {
                sum[0] += num;
            }
        });
        System.out.println("Sum of odd numbers : " + sum[0]);
    }
}
