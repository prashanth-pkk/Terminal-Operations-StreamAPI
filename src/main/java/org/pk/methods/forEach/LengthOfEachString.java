package org.pk.methods.forEach;

import java.util.Arrays;
import java.util.List;

public class LengthOfEachString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("car", "plane", "bus", "lorrey");
        list.stream().forEach(num -> System.out.println(num + " : " + num.length()));
    }
}
