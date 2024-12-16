package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCollect {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("honda", "maruthi", "bmw", "skoda", "rolls royals");
        Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
