package org.pk.methods.anyMatch;

import java.util.Arrays;
import java.util.List;

public class ConditionMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 7);

        boolean result = numbers.stream().anyMatch(n -> n > 10);
        System.out.println("Is the result satisfied give condition : " + result);

        boolean result1 = numbers.stream().anyMatch(n -> n > 15);
        System.out.println("Is the result satisfied give condition : " + result1);
    }
}
