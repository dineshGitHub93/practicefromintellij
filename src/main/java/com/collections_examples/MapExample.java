package com.collections_examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // Add Key-values pair
        Map<String, String> captials = new HashMap<>();
        captials.put("TamilNadu", "Chennai");
        captials.put("Karnataka", "Bangalore");
        captials.put("Mumbai", "Bandra");

        //Retrieve a value
        System.out.println(captials);
        System.out.println("Capital of Tamilnadu :"+ captials.get("TamilNadu"));
        captials.replace("Mumbai", "Delli");
        System.out.println(captials);

        //Loop through keys and values
        for(Map.Entry<String, String> entry : captials.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
