package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 8, 9, 11, 21);
        int number = list.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of Integers : " + number);

            //Or
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        int num = list.stream().collect(Collectors.reducing(0, Integer::sum));
        System.out.println("Sum of Integers : " + num);

    }

}
