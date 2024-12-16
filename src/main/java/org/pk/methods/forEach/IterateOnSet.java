package org.pk.methods.forEach;

import java.util.HashSet;
import java.util.Set;

public class IterateOnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.forEach(item -> System.out.println(item));
    }
}
