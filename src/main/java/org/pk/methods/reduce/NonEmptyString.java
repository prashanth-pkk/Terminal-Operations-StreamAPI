package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NonEmptyString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("", "", "Hello", "World");
        Optional<String> firstNonEmpty = list.stream().reduce((a, b) -> !a.isEmpty() ? a : b);
        System.out.println(firstNonEmpty);
    }
}
