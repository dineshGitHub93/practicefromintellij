package com.java8basics_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("sam", "Curren", "Biilings", "sam");

        List<String> uniqueNames = new ArrayList<>();
        for (String name : names){
            if(!uniqueNames.contains(name)){
                uniqueNames.add(name);
            }
        }
        System.out.println("Remove duplicates using java7 Imple : "+uniqueNames);

        List<String> uniqueNames1 = names.stream().
                distinct().
                collect(Collectors.toList());
        System.out.println("Remove duplicates using java8 Imple : "+uniqueNames1);
    }
}
