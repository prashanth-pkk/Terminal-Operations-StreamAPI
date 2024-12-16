package org.pk.methods.count;

import java.util.Arrays;
import java.util.List;

public class CountNumberOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("The total even numbers : " + count);
    }
}
