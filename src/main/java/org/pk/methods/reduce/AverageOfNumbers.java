package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int avg = list.stream().reduce(0, Integer::sum) / list.size();
        System.out.println("Average : " + avg);
    }
}
