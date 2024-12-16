package org.pk.methods.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CustomStringMinValue {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hiiiii", "bye", "hello", "fine");
        Optional<String> output = list.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("The min value : " + output);
    }
}
