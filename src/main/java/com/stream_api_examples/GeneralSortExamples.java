package com.stream_api_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneralSortExamples {

    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Wonder Women");
        superHeroes.add("Flash");
        superHeroes.add("Super man");
        superHeroes.add("Bad Man");

        //Display objects
        superHeroes.forEach(System.out::println);
        Collections.sort(superHeroes);
        System.out.println("display elements post sort : \n");
        superHeroes.forEach(System.out::println);


    }
}
