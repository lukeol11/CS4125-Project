package com.cs4125.shop.model;

public class RAM extends Component {
    private int capacity;
    private int speed;

    public RAM(String name, double price, Integer wattage, int capacity, int speed) {
        super(name, price, wattage);
        this.capacity = capacity;
        this.speed = speed;
    }
}
