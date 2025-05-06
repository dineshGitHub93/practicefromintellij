package com.method_reference_examples;

import com.function_examples.Student;

import java.io.File;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExamples {

    public static void main(String[] args) {

//        1. No-arg constructor using Supplier
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        System.out.println(listSupplier.get());

//        2. No-arg constructor using custom class
        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get());

//        3. One-arg constructor using Function
        Function<String, Student> studentWithName = Student::new;
        System.out.println(studentWithName.apply("Kunja"));

//        4. Two-arg constructor using BiFunction
        BiFunction<String, Double, Student> studentInit = Student::new;
        System.out.println(studentInit.apply("Kunja", 98.8));

//        5. Array constructor (String[])
        Function<Integer, String[]> strArrayCreator= String[]::new;
        System.out.println(Arrays.toString(strArrayCreator.apply(3)));

//        6. HashSet constructor
        Supplier<Set<String>> setSupplier = HashSet::new;
        System.out.println(setSupplier.get());

//        7. TreeMap constructor
        Supplier<Map<String, Integer>> treeMapSupplier = TreeMap::new;
        System.out.println(treeMapSupplier.get());

//        8. Optional constructor via static method reference
        Function<String, Optional<String>> optionalCreator = Optional::ofNullable;
        System.out.println(optionalCreator.apply(null));

//        9. File constructor
        Function<String, File> fileCreate = File::new;
        System.out.println(fileCreate);

//        10. Custom Product class with two parameters
       List<String> herosList = Arrays.asList("Thar", "Hulk", "Captain_America", "Thar");
       Function<List<String>, Set<String>> listToSet = HashSet::new;
       System.out.print(listToSet.apply(herosList));
    }
}
