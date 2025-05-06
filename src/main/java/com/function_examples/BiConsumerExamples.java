package com.function_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExamples {
    public static void main(String[] args) {

//        1. Print key-value pair
        BiConsumer<String, Integer> printPair = (key, value)-> System.out.println("Key : "+key+" ; "+"Value : "+value );
        printPair.accept("Kunja", 1);

//        2. Add two numbers and print the result
        BiConsumer<Integer, Integer> addNumbers = (a, b)-> System.out.println(a+b);
        addNumbers.accept(15,25);

//        3. Combine two strings and print
        BiConsumer<String, String> combineTwoStrings = (fName,lName)-> System.out.println("Hello "+fName+" "+lName+"!");
        combineTwoStrings.accept("Kunja", "Dinesh");

//        4. Populate a map using BiConsumer
        Map<String, String> info = new HashMap<>();
        BiConsumer<String, String> insertData = (k,v)->info.put(k,v);
        insertData.accept("Blue", "Sky");
        insertData.accept("White","teeth");
        System.out.println(info);

//        5. Display product and its price in formatted way
        BiConsumer<String, Double> displayProducts = (product , price)->
                System.out.printf("Product: %-10s | Price: Rs.%.2f%n", product, price);
        displayProducts.accept("Notebook", 12.75);
        displayProducts.accept("Pencil", 5.02);
    }
}
