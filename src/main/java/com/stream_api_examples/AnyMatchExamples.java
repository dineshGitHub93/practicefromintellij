package com.stream_api_examples;

import java.util.Arrays;

public class AnyMatchExamples {
    public static void main(String[] args) {
        boolean hasEven = Arrays.asList(1,3,5,7,9,10)
                .stream()
                .anyMatch(n->n%2==0);
        System.out.println("Any even number available : "+hasEven);
    }
}
