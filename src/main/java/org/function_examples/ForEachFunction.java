package org.function_examples;

import java.util.Arrays;
import java.util.List;

public class ForEachFunction {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,12,45,748,6,65,7,13);

        System.out.println("=================Classical way of implement=======================");
        for(int i=0;i<numbers.size();i++){
            System.out.print(" "+numbers.get(i));
        }

        System.out.println("\n=================ForEach way of implement========================");
        for(Integer num : numbers){
            System.out.print(" "+num);
        }

        System.out.println("\n===================ForEach Function===================================");
        numbers.forEach(list-> System.out.print(" "+list));
    }
}
