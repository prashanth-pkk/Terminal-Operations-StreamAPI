package org.pk.methods.forEach;

import java.util.stream.IntStream;

public class ForEachIntStream {
    public static void main(String[] args) {
        IntStream.range(1, 6).forEach(System.out::println);
    }
}
