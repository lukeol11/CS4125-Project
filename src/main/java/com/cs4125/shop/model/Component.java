package com.cs4125.shop.model;

public class Component {
    private String name;
    private double price;
    private Integer wattage;


    // Constructor for Component class
    public Component(String name, double price, Integer wattage) {
        this.name = name;
        this.price = price;
        this.wattage = wattage;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
