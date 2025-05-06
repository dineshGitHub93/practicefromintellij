package com.function_examples;

import java.util.function.Function;

public class FunctionExamples {

    public static void main(String[] args) {

//        1. String length
        Function<String, Integer> toFindLength = s -> s.length();
        System.out.println(toFindLength.apply("Kunja"));

//        2. Integer to String
        Function<Integer, String> intToString = i -> "number" + i;
        System.out.println(intToString.apply(8));

//        3. Square a Number
        Function<Integer, Integer> square = n->n*n;
        System.out.println(square.apply(4));

//        4. Convert to UpperCase
        Function<String, String> toUpper = str->str.toUpperCase();
        System.out.println(toUpper.apply("kunja"));

//        5. Trim White space
        Function<String, String> trimSpace = str->str.trim();
        System.out.println(trimSpace.apply(" kunja "));

//        6. Double a number
        Function<Double, Double> doubleValue = n->n*2;
        System.out.println(doubleValue.apply(2.5));

//        7. Get First character of string
        Function<String, Character> getChar = ch->ch.charAt(0);
        System.out.println(getChar.apply("Kunja"));

//        8. Boolean to String
        Function<Boolean, String> booToString = b -> b ? "True":"False";
        System.out.println(booToString.apply(false));

//        9. Integer to Boolean
        Function<Integer, Boolean> intToBoolean = i -> i>25;
        System.out.println(intToBoolean.apply(35));

//        10. Reverse a String
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverseString.apply("apple"));

//        11. Length of Array
        Function<String, Integer> length = l->l.length();
        System.out.println(length.apply("length of array"));

//        12. Fahrenheit to celsius
        Function<Double, Double> fahrenheitTocelsius = f -> (f-32) * (5/9);
        System.out.println(fahrenheitTocelsius.apply(fahrenheitTocelsius.apply(98.6)));

//        13. celsius to Fahrenheit
        Function<Double, Double>  celsiusTofahrenheit = c-> (c *9/5) /32;
        System.out.println(celsiusTofahrenheit.apply(celsiusTofahrenheit.apply(36.5)));

//        14. Parse String to Integer
        Function<String, Integer> parseInt = Integer::parseInt;
        System.out.println(parseInt.apply("550")+20);

//        15. Check if string is empty
        Function<String, Boolean> isEmpty = str -> str.isEmpty(); //String::isEmpty
        System.out.println(isEmpty.apply(""));

//        16. String Concat
        Function<String, String> concat = str -> str.concat(" Kunja ");
        System.out.println(concat.apply("Hello"));

//        17. String to char array length
        Function<String, Integer> charArrayLength = str->str.toCharArray().length;
        System.out.println(charArrayLength.apply("Java Functional "));

//        18. Square root
        Function<Double, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(12.5));

//        19. Absolute Value
        Function<Integer, Integer> absoluteValue = Math::abs;
        System.out.println(absoluteValue.apply(-22));

//        20. Replace with Dashes
        Function<String, String> replace = str->str.replace(" ","-");
        System.out.println(replace.apply("Functional Interface"));

//        21. String to boolean
        Function<String, Boolean> strToBoolean = Boolean::parseBoolean;
        System.out.println(strToBoolean.apply("true"));

//        22. Integer to Binary String
        Function<Integer, String> intToBinaryString = Integer::toBinaryString;
        System.out.println(intToBinaryString.apply(10));

//        23. remove Vowels
        Function<String, String> removeVowels = str->str.replaceAll("[aeiouAEIOU]","");
        System.out.println(removeVowels.apply("Functional"));

//        24. Append Exclamation
        Function<String, String> appendExclamation = str -> str+"!";
        System.out.println(appendExclamation.apply("Hi"));

//        25. Get last character
        Function<String, Character> getLastChar = str->str.charAt(str.length()-1);
        System.out.println(getLastChar.apply("Hello"));

//        26. Get Cube Number
        Function<Integer, Integer> cube = c-> c*c*c;
        System.out.println(cube.apply(6));

//        27. Convert string to Title Case
        Function<String, String> titleCase = str-> {
          String[] parts = str.split(" ");
          StringBuilder sb = new StringBuilder();
          for (String part : parts) {
              if (!part.isEmpty())
                  sb.append(Character.toUpperCase(part.charAt(0)))
                          .append(part.substring(1).toLowerCase())
                          .append(" ");
          }
            return sb.toString().trim();
        };
        System.out.println(titleCase.apply("functional programming"));

//        28. remove digits
        Function<String, String> removeDigits = str->str.replaceAll("\\d", "");
        System.out.println(removeDigits.apply("abc123def"));

//        29. Repeat string twice with space
        Function<String, String> repeatTwice = s -> s + " " + s;
        System.out.println(repeatTwice.apply("Again"));

//         30. Add prefix
        Function<String, String> addPrefix = s -> "Prefix_" + s;
        System.out.println(addPrefix.apply("Test"));

//        31. Remove Character from string
        Function<String,String> removeChars = str->str.replaceAll("[^a-zA-Z]","");
        System.out.println(removeChars.apply("abc123!@#def$%^"));

//        31. Remove Character from string
        Function<String,String> removeAlpha = str->str.replaceAll("[a-zA-Z]","");
        System.out.println(removeAlpha.apply("abc123!@#def$%^"));
    }
}
