package com.function_examples;

public class Student {

    private String name;
    private double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    public Student(){}

    public Student(String name) {
        this.name = name;
    }
    public double getPercentage() {
        return percentage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
