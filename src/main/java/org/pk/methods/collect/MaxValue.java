package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 6, 8, 11, 21);
        Optional<Integer> max = list.stream().collect(Collectors.maxBy(Integer::compare));
        if (max.isPresent()) {
            System.out.println("The max value : " + max.get());
        }
    }
}
