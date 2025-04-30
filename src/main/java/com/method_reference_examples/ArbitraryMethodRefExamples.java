package com.method_reference_examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ArbitraryMethodRefExamples {

    public static void main(String[] args) {
        // 1. String::toUpperCase – convert to uppercase
        Function<String, String> convertUpper = String::toUpperCase;
        System.out.println(convertUpper.apply("kunja"));

        // 2. String::length – get string length
        Function<String, Integer> findLength = String::length;
        System.out.println(findLength.apply("java"));

        // 6. List::size – get size of a list
        Function<List<?>, Integer> sizeFunc = List::size;
        System.out.println(sizeFunc.apply(Arrays.asList(1, 2, 3))); // 3

        // 7. List::contains – check if list contains element
        BiPredicate<List<String>, String> containsFunc = List::contains;
        System.out.println(containsFunc.test(Arrays.asList("a", "b", "c"), "b")); // true
    }
}
