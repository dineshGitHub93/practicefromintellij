package com.string_examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringConcepts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to reverse ");
        String text = sc.next();
        StringBuilder sb = new StringBuilder();

        char[] inputArray = text.toCharArray();

        for (int i = inputArray.length-1; i>=0; i--){
            sb.append(inputArray[i]);
        }
        System.out.println(sb);

        //Using java8 implementation
      String reverseText =Stream.of(text).
              map(StringBuilder::new).
              map(StringBuilder::reverse).collect(Collectors.joining());
        System.out.println(reverseText);
    }
}
