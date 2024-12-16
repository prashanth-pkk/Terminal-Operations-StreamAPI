package org.pk.methods.forEach;

import java.util.LinkedHashSet;
import java.util.Set;

public class ForEachWithLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        set.forEach(item -> System.out.println(item));
    }
}
