package org.pk.methods.anyMatch;

import java.util.Arrays;
import java.util.List;

public class EvenNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8);

        boolean result = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("The even number : " + result);
    }
}
