package com.stream_api_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOfFlastMap {

    public static void main(String[] args) {
        List<String> numberList1 = Arrays.asList("One", "Two", "Three");
        List<String> numberList2 = Arrays.asList("Four", "Five", "Six");
        List<String> numberList3 = Arrays.asList("Seven", "Eight", "Nine");

       List<List<String>> listoflistNumbers = Arrays.asList(numberList1, numberList2, numberList3);
       System.out.println(listoflistNumbers);

      List<String> numbers = listoflistNumbers.stream()
               .flatMap(List::stream)
               .collect(Collectors.toList());
      System.out.println(numbers);
    }

}
