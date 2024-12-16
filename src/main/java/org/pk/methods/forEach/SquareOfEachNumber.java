package org.pk.methods.forEach;

import java.util.ArrayList;
import java.util.List;

public class SquareOfEachNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(9);

        list.forEach(num -> System.out.println(num * num));
    }
}
