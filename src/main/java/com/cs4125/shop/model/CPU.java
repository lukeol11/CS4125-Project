package com.cs4125.shop.model;

public class CPU extends Component {
    private int cores;
    private String socket;

    // Constructor for CPU class
    public CPU(String name, double price, Integer wattage, int cores, String socket) {
        super(name, price, wattage); // Call the constructor of the superclass (Component)
        this.cores = cores;
        this.socket = socket;
    }
}
