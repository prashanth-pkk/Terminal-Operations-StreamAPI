package org.pk.methods.forEach;

import java.util.HashMap;
import java.util.Map;

public class ForEachWithMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 1);
        map.put("mango", 2);
        map.put("apple", 3);

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
