package com.cs4125.shop.model;

public class PowerSupply extends Component {
    private int wattageOutput;
    private String efficiencyRating;

    public PowerSupply(String name, double price, Integer wattage, int wattageOutput, String efficiencyRating) {
        super(name, price, wattage);
        this.wattageOutput = wattageOutput;
        this.efficiencyRating = efficiencyRating;
    }
}
