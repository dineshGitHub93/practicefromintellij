package com.optional_examples;

public class Person {

    private String name;
    private  Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public String getCarInsuranceName(Person person){

        if (person!=null){
            Car car1 = person.getCar();
            if (car1!=null){
              Insurance insurance = car1.getInsurance();
              if (insurance!=null){
                  return insurance.getName();
              }
            }
        }
        return  "One of object returns null values";
    }
}
