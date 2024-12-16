package org.pk.methods.forEach;

import java.util.Arrays;

public class ForEachArray {
    public static void main(String[] args) {
        String[] str = {"Java", "Python", "C++"};
        Arrays.asList(str).forEach(System.out::println);
    }
}
