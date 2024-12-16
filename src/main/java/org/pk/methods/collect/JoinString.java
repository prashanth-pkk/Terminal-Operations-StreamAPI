package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "is", "a", "programming");
        String str = list.stream()
                .collect(Collectors.joining(" "));
        System.out.println("The string join : " + str);
    }
}
