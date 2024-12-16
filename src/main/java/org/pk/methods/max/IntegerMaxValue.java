package org.pk.methods.max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerMaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 11, 1, 23, 77, 2, 25);
        Optional<Integer> max_value = list.stream().max(Integer::compareTo);
        System.out.println("The max value : " + max_value);
    }
}
