package com.function_examples;

import java.util.function.Function;
import java.util.function.Predicate;

public class QuickRevised {

    public static void main(String[] args) {
//        Function Interface implements
        Function<String, Integer> getLength = str->str.length();
        System.out.println(getLength.apply("Java"));

//        Function Interface's default method implementation
        Function<String, String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("Functional Program"));
        Function<String, Integer> StrManipulation = toUpper.andThen(getLength);
        System.out.println(StrManipulation.apply("Functional Program"));

        Function<String, Character> getFirstChar = str->str.charAt(0);
        Function<String, Character>  charManipulation = getFirstChar.compose(toUpper);
        System.out.println(charManipulation.apply("functional"));

//        Predicate Interface implements
        Predicate<Integer> isEven = i->i%2==0;
        Predicate<Integer> isGreater = i->i>=15;
        Predicate<Integer> intValidation = isEven.and(isGreater);
        System.out.println(intValidation.test(18));

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> strLength = str->str.length()>5;
        System.out.println(isEmpty.or(strLength).test("Hello World"));

        Predicate<String> isNegate = isEmpty.negate();
        System.out.println(isNegate.test(" "));

    }
}
