package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class CheckAllElementsArePositive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, -5);
        boolean result = list.stream().reduce(true, (a, b) -> a && b > 0, Boolean::logicalAnd);
        System.out.println("All positive : " + result);
    }
}
