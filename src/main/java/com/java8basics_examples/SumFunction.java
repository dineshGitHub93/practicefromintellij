package com.java8basics_examples;

import java.util.stream.IntStream;

public class SumFunction {

    public static void main(String[] args) {

        int total = 0;

        for(int i=0; i<=50; i++){
            total +=i;
        }
        System.out.println("Before java8 : "+total);

        int total1 = IntStream.range(0,50).sum();
        System.out.println("After java8 : "+total1);
    }

}
