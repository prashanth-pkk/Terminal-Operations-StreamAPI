package org.pk.methods.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomObject {
    static class Result {
        int sum;
        int count;

        Result(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }

        public String toString() {
            return sum + " " + count;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Result result = numbers.stream()
                .collect(Collectors.collectingAndThen(Collectors.reducing(0, Integer::sum)
                        , sum -> new Result(sum, numbers.size())));
        System.out.println("Sum of the elements AND size of the elements : " + result);
    }
}
