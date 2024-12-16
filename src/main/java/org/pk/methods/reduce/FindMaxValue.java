package org.pk.methods.reduce;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class FindMaxValue {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(4);
        set.add(7);
        set.add(5);

        Optional<Integer> max = set.stream().reduce(Integer::max);
        System.out.println(max);

    }
}
