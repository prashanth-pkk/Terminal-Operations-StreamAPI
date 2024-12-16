package org.pk.methods.collect;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumber {
    public static void main(String[] args) {
        Integer[] number = {1, 2, 3, 4, 5, 6, 7, 9, 12};
        List<Integer> list = Arrays.asList(number);

        Map<String, List<Integer>> result = list.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));

        System.out.println("even number : " + result.get("even"));
        System.out.println("odd number : " + result.get("odd"));
    }
}
