package com.optional_examples;

public class Runner {

    public static void main(String[] args) {

        Person kunja = new Person("Kunja", new Car("BMW", new Insurance("TATA AIA")));
        System.out.println(kunja.getCarInsuranceName(kunja));

        Person dinesh = new Person("Dinesh", null);
        System.out.println(dinesh.getCarInsuranceName(dinesh));

        Person gayathri = new Person("Gayathri", new Car("Swift", new Insurance("United India Insuranc")));
        System.out.println(dinesh.getCarInsuranceName(gayathri));

        Person dinesh1 = new Person("Dinesh", new Car("Audi", null));
        System.out.println(dinesh.getCarInsuranceName(dinesh1));

    }
}
