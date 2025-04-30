package com.method_reference_examples;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RealStaticMethodRefExamples {

    public static void main(String[] args) {

//        1. Math::abs – get absolute value
        Function<Integer, Integer> absValue = Math::abs;
        System.out.println(absValue.apply(-42));

//        2. Integer::parseInt – convert String to int
        Function<String,Integer> parseInt=Integer::parseInt;
        System.out.println(parseInt.apply("256")+12);

//        Double::parseDouble – convert String to double
        Function<String, Double> parseDouble = Double::parseDouble;
        System.out.println(parseDouble.apply("3.14")*3);

//        4. Math::max – find max of two numbers
        BiFunction<Integer, Integer, Integer> toFindMax = Math::max;
        System.out.println(toFindMax.apply(18,69));

//        5. Math::min – find max of two numbers
        BiFunction<Integer, Integer, Integer> toFindMin = Math::min;
        System.out.println(toFindMin.apply(18,69));

//        6. String::valueOf – convert int to String
        Function<Integer, String>  intToString = String::valueOf;
        System.out.println(intToString.apply(123)+1);

//        7. Objects::isNull – check if object is null
        Predicate<String> isNonNUll=Objects::nonNull;
        System.out.println(isNonNUll.test("Hello"));

//        9. Arrays::sort – sort an array
        Consumer<int[]> sorter =Arrays::sort;
        int[] nums = {5, 2, 9, 1};
        sorter.accept(nums);
        System.out.println(Arrays.toString(nums));

    }
}
