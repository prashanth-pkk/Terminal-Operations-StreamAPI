package org.pk.methods.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEachWithList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().forEach(item -> System.out.println(item));
    }
}
