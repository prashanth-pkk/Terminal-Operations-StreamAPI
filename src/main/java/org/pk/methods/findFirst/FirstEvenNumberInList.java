package org.pk.methods.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEvenNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 8, 9);
        Optional<Integer> result = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println("First even number : " + result);
    }
}
