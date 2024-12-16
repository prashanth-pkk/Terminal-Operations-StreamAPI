package org.pk.methods.forEach;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("mango");
        list.add("apple");

        list.stream().forEach(num -> System.out.println(num));
    }
}
