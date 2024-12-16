package org.pk.methods.forEach;

import java.util.HashMap;
import java.util.Map;

public class CountEachOccuranceInSentence {
    public static void main(String[] args) {
        String sentence  = "hello, java programming";
        Map<Character, Integer> charCount = new HashMap<>();
        sentence.chars().forEach(c->charCount.merge((char) c,1,Integer::compare));
    }
}
