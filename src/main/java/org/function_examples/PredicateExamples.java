package org.function_examples;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {

//        1. Check if a number is positive
        Predicate<Integer> checkPositive = n -> n>=0;
        System.out.println(checkPositive.test(7));

//        2. Check if a number is even
        Predicate<Integer> checkEven = n -> n%2==0;
        System.out.println(checkEven.test(6));

//        3. Check if a string is empty
        Predicate<String> isEmptyString = str -> str.isEmpty();
        System.out.println(isEmptyString.test(""));

//        4. Check if a string starts with 'A'
        Predicate<String> startsWithA = str ->str.startsWith("A");
        System.out.println(startsWithA.test("Apple"));

//        5. Check if a list is empty
        Predicate<List> checkListEmpty = List::isEmpty;
        System.out.println(checkListEmpty.test(Collections.emptyList()));

//        6. Check if an integer is greater than 10
        Predicate<Integer> checkGreater = n -> n>10;
        System.out.println(checkGreater.test(15));

//        7. Check if a string length is greater than 5
        Predicate<String> checkLength = str -> str.length()>5;
        System.out.println(checkLength.test("predicate"));

//        8. Check if a number is a multiple of 5
        Predicate<Integer> multipleByFive = n -> n%5==0;
        System.out.println(multipleByFive.test(25));

//        9. Check if a string contains "Java"
        Predicate<String> containsJava = str->str.contains("java");
        System.out.println(containsJava.test("functional java"));

//        10. Check if a character is a vowel
        Predicate<Character> isVowel = c -> "aeiouAEIOU".indexOf(c) != -1;
        System.out.println(isVowel.test('e'));

//        11. Check if a double is between 0 and 1
        Predicate<Double> isDouble = d ->d>=0 && d<=1;
        System.out.println(isDouble.test(0.82));

//        12. Check if a year is a leap year (simplified)
        Predicate<Integer> isLeapYear = year -> (year % 4 ==0 && year % 100 !=0) || (year%400==0);
        System.out.println(isLeapYear.test(2024));

//        13. Check if a string is a palindrome
        Predicate<String> checkPalindrom = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        System.out.println(checkPalindrom.test("madam"));

//        14. Check if a number is prime (simple)
        Predicate<Integer> isPrime = num -> {
          if(num<=1) return  false;
          for (int i=2; i<=Math.sqrt(num); i++){
              if(num % i == 0) return  false;
          }
          return true;
        };
        System.out.println(isPrime.test(7));

//        15. Check if a file name ends with ".txt"
        Predicate<String> checkFileName = str -> str.endsWith(".txt");
        System.out.println(checkFileName.test("notes.txt"));


    }
}
