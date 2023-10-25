package com.cs4125.shop.model;

public class Case extends Component {
    private String formFactor;
    private int driveBays;

    public Case(String name, double price, Integer wattage, String formFactor, int driveBays) {
        super(name, price, wattage);
        this.formFactor = formFactor;
        this.driveBays = driveBays;
    }
}
