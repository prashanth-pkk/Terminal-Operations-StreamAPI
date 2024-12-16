package org.pk.methods.toArray;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");
        String[] arr = list.toArray(new String[0]);
        System.out.println(""+Arrays.toString(arr));
    }
}
