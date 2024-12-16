package org.pk.methods.reduce;

import java.util.Arrays;

public class Concatenate {
    public static void main(String[] args) {
        String[] words = {"This", "is", "Java"};
        String result = Arrays.stream(words).reduce("", String::concat);
        System.out.println(result);
    }
}
