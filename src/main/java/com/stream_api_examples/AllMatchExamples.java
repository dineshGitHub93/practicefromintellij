package com.stream_api_examples;

import java.util.Arrays;

public class AllMatchExamples {
    public static void main(String[] args) {
        boolean allPositiveCheck = Arrays.asList(2,4,6,8,10)
                .stream()
                .allMatch(n-> n>0);
        System.out.println("Check all given numbers are positive : "+allPositiveCheck);

        boolean isEmpty = Arrays.asList("Alice", "Bob", "Charlie")
                .stream().allMatch(String::isEmpty);
        System.out.println("Check all Strings are empty : "+isEmpty);
    }
}
