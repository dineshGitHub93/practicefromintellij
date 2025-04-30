package com.method_reference_examples;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CustomStaticMethodRefExamples {

    // Static utility class with various static methods
    static class Utils {
        public static void printMessage() {
            System.out.println("Hello from static method!");
        }

        public static int square(int x) {
            return x * x;
        }

        public static String toUpper(String s) {
            return s.toUpperCase();
        }

        public static boolean isEven(int x) {
            return x % 2 == 0;
        }

        public static void printName(String name) {
            System.out.println("Name: " + name);
        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static double power(double base, double exp) {
            return Math.pow(base, exp);
        }

        public static boolean startsWithJava(String s) {
            return s.startsWith("Java");
        }

        public static void printLength(String s) {
            System.out.println("Length: " + s.length());
        }

        public static String staticConcat(String a, String b) {
            return a + " " + b;
        }
    }

    public static void main(String[] args) {
        // 1. Runnable using method reference
        Runnable r = Utils::printMessage;
        r.run();

        // 2. Function to square a number
        Function<Integer, Integer> square = Utils::square;
        System.out.println(square.apply(5)); //25

        // 3. Function to convert string to uppercase
        Function<String, String> toUpper = Utils::toUpper;
        System.out.println(toUpper.apply("kunja"));

        // 4. Predicate to check if a number is even
        Predicate<Integer> isEven = Utils::isEven;
        System.out.println(isEven.test(12));

        // 5. Consumer to print name
        Consumer<String> printName = Utils::printName;
        printName.accept("Kunja");

        // 6. BiFunction to add two numbers
        BiFunction<Integer,Integer,Integer> sum = Utils::add;
        System.out.println(sum.apply(12,26));

        // 7. BiFunction to calculate power
        BiFunction<Double,Double,Double> calcPower = Utils::power;
        System.out.println(calcPower.apply(3.24, 1.4));

        // 8. Predicate to check if string starts with "Java"
        Predicate<String> checkNameStarts = Utils::startsWithJava;
        System.out.println(checkNameStarts.test("Kunja"));

        // 9. Consumer to print string length
        Consumer<String> length = Utils::printLength;
        length.accept("Hello");

        // 10. BiFunction to concatenate strings
        BiFunction<String,String,String> strConcat = Utils::staticConcat;
        System.out.println(strConcat.apply("Hello", "World"));
    }
}
