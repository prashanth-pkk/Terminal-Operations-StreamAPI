package org.pk.methods.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CustomStringMaxValue {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "bye", "fine", "hello", "good");
        Optional<String> max = list.stream().max((x, y) -> Integer.compare(x.length(), y.length()));
        System.out.println("The max : " + max);

        //OR

        Optional<String> max1 = list.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("The max : " + max1);
    }
}
