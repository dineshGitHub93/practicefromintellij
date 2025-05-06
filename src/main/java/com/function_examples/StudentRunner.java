package com.function_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentRunner {

    public static void main(String[] args) {
        List<Student> stduentList = new ArrayList<>();

        stduentList.add(new Student("Kunja", 59.5));
        stduentList.add(new Student("Kunja_Mom", 55.6));
        stduentList.add(new Student("Kunja_daddy", 48.6));

        Predicate<Student> lessThan40 = list -> list.getPercentage()<60;

        for (Student students : stduentList) {
             if(lessThan40.test(students)){
                 System.out.println(students.getName()+" "+students.getPercentage());
             }
        }
    }
}
