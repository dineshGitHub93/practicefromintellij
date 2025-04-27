package org.function_examples;

import java.util.function.Predicate;

public class UserRegistrationValidator {

    public static void main(String[] args) {
        /*
        Username must be non-empty and at least 5 characters long
        Password must be non-empty and at least 8 characters
        Email must contain '@' and not start or end with '@'
         */

        String username = "JohnDoe";
        String password = "pass1234";
        String email = "john@example.com";

//        --- Username Validation ---
        Predicate<String> nonEmpty = str-> !str.isEmpty();
        Predicate<String> greaterFive = str-> str.length()>=5;
        Predicate<String> userNameCondition = nonEmpty.and(greaterFive);

//        --- Password Validation ---
        Predicate<String> passwordNotEmpty = s -> !s.isEmpty();
        Predicate<String> shouldEight = str->str.length()>=8;
        Predicate<String> passwordCondition =  passwordNotEmpty.and(shouldEight);

//        --- Email Validation ---
        Predicate<String> ContainsAt = str->str.contains("@");
        Predicate<String> startAndEnd = str-> !str.startsWith("@") && !str.endsWith("@");
        Predicate<String> emailCondition = ContainsAt.and(startAndEnd);

        boolean isUserValid = userNameCondition.test(username) && passwordCondition.test(password) && emailCondition.test(email);

        if(isUserValid)
            System.out.println("Registration success full");
        else
            System.out.println("Registration failed, Please check your Inputs");
    }
}
