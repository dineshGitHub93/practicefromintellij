package com.stream_api_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValue {

    public static void main(String[] args) {
        List<String> names = Arrays.asList( "Arun", "Priya", "Kumar", "Divya", "Arun",
                "Suresh", "Priya", "Meena", "Kumar", "Ravi");
        System.out.println("Name List With Duplicates");

         names.stream()
                .distinct()
                .forEach(System.out::println);  ;

    }
}
