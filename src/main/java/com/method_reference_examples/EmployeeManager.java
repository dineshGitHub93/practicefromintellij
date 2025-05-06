package com.method_reference_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class EmployeeManager {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

//        1. Create using no-arg constructor (Supplier)
        Supplier<Employee> employeeSupplier = Employee::new;
        System.out.println(employeeSupplier.get());

//        2. Create using 1-arg constructor (Function)
        Function<String, Employee> employeeByName = Employee::new;
        System.out.println(employeeByName.apply("Dinesh"));

//        3. Create using 2-arg constructor (BiFunction)
        BiFunction<String, String, Employee> employeeBiFunction = Employee::new;
        employees.add(employeeBiFunction.apply("Dinesh", "Engineer"));
        employees.add(employeeBiFunction.apply("Kunja", "Engineer"));
        employees.add(employeeBiFunction.apply("Gayathri", "Tester"));
        employees.add(employeeBiFunction.apply("Veronica", "Manager"));

//         4. Print all employees using Consumer + method reference
        System.out.println("Print All Employees");
        Consumer<Employee> display = System.out::println;
        employees.forEach(display);

//         5. Filter by department using Predicate + method reference
        System.out.println("\nEngineering Employees:");
        employees.stream()
                .filter(emp -> "Engineer".equals(emp.getEmpDpt()))
                .forEach(System.out::println);

//        6. Use map with constructor reference for new list of names
        System.out.println("\nEmployee Names:");
        employees.stream()
                .map(emp->emp.toString())
                .forEach(System.out::println);
    }
}
