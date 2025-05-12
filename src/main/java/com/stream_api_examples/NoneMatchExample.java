package com.stream_api_examples;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        boolean checkNegative = Arrays.asList(1,2,3,6,5,4,8, -1)
                .stream()
                .noneMatch(n->n<0);
        System.out.println("Check given numbers are none negative : "+checkNegative);

        List<String> words = Arrays.asList("Hello", "World", "Java");
        System.out.println("Check words are not empty : "+words.stream()
                .noneMatch(String::isEmpty));
    }
}
