package com.cs4125.shop.model;

public class GraphicsCard extends Component {
    private int memory;
    private int baseClock;

    public GraphicsCard(String name, double price, Integer wattage, int memory, int baseClock) {
        super(name, price, wattage);
        this.memory = memory;
        this.baseClock = baseClock;
    }
}
