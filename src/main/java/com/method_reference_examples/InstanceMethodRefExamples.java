package com.method_reference_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class InstanceMethodRefExamples {

    public static void main(String[] args) {
        // Example 1: String::toUpperCase – convert to uppercase
        Function<String, String> covertUpper = String::toUpperCase;
        System.out.println(covertUpper.apply("hello"));

        // Example 2: String::length – get length of a string
        Function<String,Integer> strLength = String::length;
        System.out.println(strLength.apply("Java"));

        // Example 3: String::startsWith – checks if string starts with "J"
        Predicate<String> startsWithJ = s->s.startsWith("j");
        Predicate<String> startsWithJava = "Java"::startsWith;
        System.out.println(startsWithJava.test("Java"));

        // Example 4: List::isEmpty – check if a list is empty
        List<Integer> list = Arrays.asList(1,5,3);
        Predicate<List<Integer>> isEmpty = List::isEmpty;
        System.out.println(isEmpty.test(list));

        // Example 5: ArrayList::size – get size of list
        Supplier<Integer> listSize = list::size;
        System.out.println(listSize.get());

        // Example 6: String::substring – substring from given index
        BiFunction<String, Integer, String> substringRemove = String::substring;
        System.out.println(substringRemove.apply("Java Programming", 5));

        // Example 7: Using instance::method in forEach
        list.forEach(System.out::println);

        // Example 8: Comparator using String::compareTo
        Comparator<String> comp = String::compareTo;
        System.out.println(comp.compare("apple","banana"));

        // Example 9: String::equals – check equality
        BiPredicate<String, String> checkEquals = String::equals;
        System.out.println(checkEquals.test("Hello", "Hello"));


    }
}
