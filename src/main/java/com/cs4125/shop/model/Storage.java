package com.cs4125.shop.model;

public class Storage extends Component {
    private int capacity;
    private String type; // e.g., HDD, SSD, NVMe

    public Storage(String name, double price, Integer wattage, int capacity, String type) {
        super(name, price, wattage);
        this.capacity = capacity;
        this.type = type;
    }
}
