package org.function_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemoWithStudent {

    public static void main(String[] args) {

        List<Student> stduentList = new ArrayList<>();

        stduentList.add(new Student("Kunja", 59.5));
        stduentList.add(new Student("Kunja_Mom", 55.6));
        stduentList.add(new Student("Kunja_daddy", 48.6));

        //stduentList.forEach(input-> System.out.println(input));

        Supplier<List<Student>> students = ()->stduentList;
        System.out.println(students.get());
    }
}
