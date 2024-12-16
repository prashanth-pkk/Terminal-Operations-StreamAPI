package org.pk.methods.parallel;

import java.util.ArrayList;
import java.util.List;

public class ComparisonSequentialAndParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        // Measure time for sequential stream
        long start = System.nanoTime();
        numbers.stream()
                .map(n -> n * n)  // Squaring each number
                .count();
        long end = System.nanoTime();
        System.out.println("Sequential Stream Time: " + (end - start) + " ns");

        // Measure time for parallel stream
        start = System.nanoTime();
        numbers.parallelStream()
                .map(n -> n * n)  // Squaring each number
                .count();
        end = System.nanoTime();
        System.out.println("Parallel Stream Time: " + (end - start) + " ns");
    }
}
