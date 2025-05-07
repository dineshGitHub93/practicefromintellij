package com.stream_api_examples;

public class Mobile2{



    public enum Brand {
        APPLE, SAMSUNG, MOTO, GOOGLE, ONEPLUS, NOKIA, XIAOMI;
    }
    private Brand brand;
    private String model;
    private int memory;
    private double price;
    private int megapixel;
    private double displaySize;
    private String color;

    public Mobile2(Brand brand, String model, int memory, double price, int megapixel, double displaySize, String color) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.price = price;
        this.megapixel = megapixel;
        this.displaySize = displaySize;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", price=" + price +
                ", megapixel=" + megapixel +
                ", displaySize=" + displaySize +
                ", color='" + color + '\'' +
                '}';
    }
}
