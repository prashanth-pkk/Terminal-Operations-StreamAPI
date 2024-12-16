package org.pk.methods.max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringMaxValue {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "how are you", "bye", "hi");
        Optional<String> max = list.stream().max(String::compareTo);
        System.out.println("The string max value : " + max);
    }
}
