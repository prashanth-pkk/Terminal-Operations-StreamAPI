package org.pk.methods.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringMinValue {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "bye", "fine", "hello");
        Optional<String> output = list.stream().min(String::compareTo);
        System.out.println("The min value : " + output);
    }
}
