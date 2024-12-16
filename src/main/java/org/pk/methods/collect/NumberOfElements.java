package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long count = list.stream().collect(Collectors.counting());
        System.out.println("Length of the stream : " + count);
    }
}
