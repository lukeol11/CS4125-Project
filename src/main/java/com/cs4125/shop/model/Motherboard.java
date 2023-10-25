package com.cs4125.shop.model;

public class Motherboard extends Component {
    private String chipset;
    private String formFactor;

    public Motherboard(String name, double price, Integer wattage, String chipset, String formFactor) {
        super(name, price, wattage);
        this.chipset = chipset;
        this.formFactor = formFactor;
    }
}
