package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NonZero {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 0, 0, 1, 2);
        Optional<Integer> firstNonZero = list.stream().reduce((a, b) -> a == 0 ? b : a);
        System.out.println(firstNonZero);
    }
}
