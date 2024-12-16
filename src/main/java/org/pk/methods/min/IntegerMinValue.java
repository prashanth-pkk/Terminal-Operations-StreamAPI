package org.pk.methods.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerMinValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 7, 11, 26, 2, 55);
        Optional<Integer> min_value = list.stream().min(Integer::compareTo);
        System.out.println("The min value : " + min_value);
    }
}
