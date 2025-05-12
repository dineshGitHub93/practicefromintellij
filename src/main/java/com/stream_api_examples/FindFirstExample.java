package com.stream_api_examples;

import java.util.Arrays;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
     Optional<Integer> findFirstElement =Arrays.asList(1,2,3,6,5)
                .stream().findFirst();
        System.out.println(findFirstElement.get());

        Optional<Integer> findAnyElement =Arrays.asList(1,2,3,6,5)
                .stream().findAny();
        System.out.println(findAnyElement.get());

        Optional<Integer> findAnyElementParallel =Arrays.asList(1,2,3,6,5)
                .parallelStream().findAny();
        System.out.println(findAnyElementParallel.get());

    }
}
