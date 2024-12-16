package org.pk.methods.toArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArray {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("PHP");
        String[] arr = set.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}
