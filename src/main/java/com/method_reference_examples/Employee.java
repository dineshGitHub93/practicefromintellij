package com.method_reference_examples;

import java.util.Random;

public class Employee {
    private String empName;
    private String empDpt;
    private int id;

    public Employee() {
        this.empName = "unknown";
        this.empDpt = "General";
        this.id = 0;
    }

    public Employee(String empName) {
        this.empName = empName;
        this.empDpt = "General";
        this.id = new Random().nextInt(1000);
    }

    public Employee(String empName, String empDpt) {
        this.empName = empName;
        this.empDpt = empDpt;
        this.id = new Random().nextInt(1000);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empDpt='" + empDpt + '\'' +
                ", id=" + id +
                '}';
    }

    public String getEmpDpt() {
        return empDpt;
    }
}
