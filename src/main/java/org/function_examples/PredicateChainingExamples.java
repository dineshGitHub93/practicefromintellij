package org.function_examples;

import java.util.function.Predicate;

public class PredicateChainingExamples {

    public static void main(String[] args) {

//         --- and() examples ---

//        1. Number > 10 AND even
        Predicate<Integer> greaterTen = n -> n>10;
        Predicate<Integer> isEven = n -> n %2 ==0;
        Predicate<Integer> checkBothCond = greaterTen.and(isEven);
        System.out.println(checkBothCond.test(16)); // true
        System.out.println(checkBothCond.test(19)); // false

//        2. String length > 5 AND contains "Java"
        Predicate<String> length = str -> str.length()>5;
        Predicate<String> containsJava = str -> str.contains("java");
        Predicate<String> lengthContainsJava = length.and(containsJava);
        System.out.println(lengthContainsJava.test("java program")); // true
        System.out.println(lengthContainsJava.test("Program")); //false

//        --- or() examples ---

//        3. Number < 0 OR number > 100
        Predicate<Integer> lessThan = n -> n<0;
        Predicate<Integer> greaterThan = x -> x>100;
        Predicate<Integer> lesserAndGreater = lessThan.or(greaterThan);
        System.out.println(lesserAndGreater.test(55)); // false
        System.out.println(lesserAndGreater.test(101)); // true

//        --- negate() examples ---

        // 4. Not empty string
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNagate = isEmpty.negate();
        System.out.println(isNagate.test("Test")); //true
        System.out.println(isNagate.test("")); // false

//        5. Number is NOT even (odd)
        Predicate<Integer> isNegateNumber = isEven.negate();
        System.out.println(isNegateNumber.test(4)); // false
        System.out.println(isNegateNumber.test(5)); //true
    }
}
