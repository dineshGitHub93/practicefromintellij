package org.function_examples;

import java.util.function.BiPredicate;

public class BiPredicateExamples {
    public static void main(String[] args) {
//        1. Check if two strings are equal (case-sensitive)
        BiPredicate<String, String> isEqula = (s1, s2)->s1.equals(s2);
        System.out.println(isEqula.test("Hello", "Hello"));

//        2. Check if first number is greater than second
        BiPredicate<Integer, Integer> isGreater = (n1, n2)-> n1>n2;
        System.out.println(isGreater.test(33,11));

//        3. Check if both strings start with the same letter
        BiPredicate<String, String> strCmpare = (str1, str2)->str2.charAt(0)==str2.charAt(0);
        System.out.println(strCmpare.test("Hello", "How"));

//        4. Check if user has enough balance to purchase
        BiPredicate<Double, Double> checkBalance = (balance, price)->balance>=price;
        System.out.println(checkBalance.test(1890.0, 786.50));

//        5. Check if two numbers are both even
        BiPredicate<Integer, Integer> checkEven = (n, n1)-> n%2==0 && n1%2==0;
        System.out.println(checkEven.test(16,8));
    }
}
