package org.pk.methods.reduce;

import java.util.Arrays;
import java.util.List;

public class ProductsOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5);
        long product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("The product of numbers : " + product);
    }
}
