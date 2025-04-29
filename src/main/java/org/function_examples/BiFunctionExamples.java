package org.function_examples;

import java.util.function.BiFunction;

public class BiFunctionExamples {
    public static void main(String[] args) {

//        1.Add two Integers
        BiFunction<Integer, Integer, Integer> add = (a,b)-> a+b;
        System.out.println(add.apply(12,15)); // 27

//        2.Concatenate two Strings
        BiFunction<String, String, String> concatenate = (str1, str2)->str1.concat(str2);
        System.out.println(concatenate.apply("Hello ", "Java"));

//        3.Multiply two numbers
        BiFunction<Integer, Integer, Integer> multiply = (i, j)->i*j;
        System.out.println(multiply.apply(6,6));

//        4. Find max of two numbers
        BiFunction<Integer, Integer,Integer> findMaxNumber = (i, j)->i>j ? i:j;
        System.out.println(findMaxNumber.apply(75, 50));

//        5. Format full name
        BiFunction<String, String, String> formFullName = (firstName, lastName)-> firstName+" "+lastName;
        System.out.println(formFullName.apply("Kunja", "Dinesh"));

//        6. Compare two strings by length
        BiFunction<String, String, String> longerString =(str1, str2)->str1.length()>str2.length() ?str1:str2;
        System.out.println(longerString.apply("Java", "Programming"));

//        7. Check if sum is even or odd
        BiFunction<Integer, Integer, String> oddEven =(num1, num2)->(num1+num2)%2==0?"Even":"ODD";
        System.out.println(oddEven.apply(7,1));

//         8. Combine two arrays into one string
        BiFunction<int[], int[], String> combineArrays = (arr1, arr2)->{
          StringBuilder sb = new StringBuilder();
          for (int i :arr1) sb.append(i).append(" ");
          for (int j : arr2) sb.append(j).append(" ");
          return sb.toString().trim();
        };
        System.out.println(combineArrays.apply(new int[]{8,9,5,7,}, new int[]{8,7,9,5,0}));

//          9. Calculate age difference
        BiFunction<Integer, Integer, Integer> findAgeDifference = (age1, age2)->Math.abs(age1-age2);
        System.out.println(findAgeDifference.apply(18,33));

//        10. Generate email ID from name and domain
        BiFunction<String,String,String> generateEmailID = (name, domain)-> name.toLowerCase()+"@"+domain.toLowerCase();
        System.out.println(generateEmailID.apply("kUnJa", "ExamPle.cOm"));

    }


}
