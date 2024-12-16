#Terminal Operations

The Terminal operations  that trigger the processing of a stream and produce a result or a side-effect. Once a terminal operation is invoked, the stream is considered consumed and can no longer be used.

#List of Terminal operations
1. forEach(Consumer<? super T> action)
2. forEachOrdered(Consumer<? super T> action)
3. toArray()
4. reduce(BinaryOperator<T> accumulator)
5. collect(Collector<? super T, A, R> collector)
6. min(Comparator<? super T> comparator)
7. max(Comparator<? super T> comparator)
8. count()
9. anyMatch(Predicate<? super T> predicate)
10. allMatch(Predicate<? super T> predicate)
11. noneMatch(Predicate<? super T> predicate)
12. findFirst()
13. findAny()
14. parallel()
15. close()
