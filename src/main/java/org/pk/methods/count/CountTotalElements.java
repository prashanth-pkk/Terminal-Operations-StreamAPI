package org.pk.methods.count;

import java.util.Arrays;
import java.util.List;

public class CountTotalElements {
    public static void main(String[] args) {
        List<? extends Number> list = Arrays.asList(3, 7, 9, 11, 25, 76, 80, 91.1);
        long count = list.stream().count();
        System.out.println("The total elements : " + count);
    }
}
