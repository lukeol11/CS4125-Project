package com.cs4125.shop.shoppingCart;

import com.cs4125.shop.model.Component;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Component> Components;

    public ShoppingCart() {
        Components = new ArrayList<>();
    }

    public void addComponent(Component Component) {
        Components.add(Component);
    }

    public void removeComponent(Component Component) {
        Components.remove(Component);
    }

    public List<Component> getComponents() {
        return Components;
    }
}
