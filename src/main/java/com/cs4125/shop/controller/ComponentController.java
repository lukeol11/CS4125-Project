package com.cs4125.shop.controller;

import com.cs4125.shop.model.*;
import com.cs4125.shop.shoppingCart.ShoppingCart;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ComponentController {
    private List<Component> componentList = new ArrayList<>();
    private ShoppingCart cart = new ShoppingCart();

    public ComponentController () {
        componentList.add(new CPU("Intel Core i7-9700K", 409.99, 95, 8, "LGA 1151"));
        componentList.add(new CPU("AMD Ryzen 7 3700X", 329.99, 65, 8, "AM4"));
        componentList.add(new CPU("Intel Core i9-9900K", 529.99, 95, 8, "LGA 1151"));
        // motherboard
        componentList.add(new Motherboard("ASUS ROG Strix Z390-E", 279.99, 60, "Z390", "ATX"));
        componentList.add(new Motherboard("ASUS ROG Strix X570-E", 329.99, 60, "X570", "ATX"));
        componentList.add(new Motherboard("ASUS ROG Strix Z390-F", 229.99, 60, "Z390", "ATX"));
        // ram
        componentList.add(new RAM("Corsair Vengeance LPX 16GB", 79.99, 10, 16, 3200));
        componentList.add(new RAM("Corsair Vengeance LPX 32GB", 149.99, 10, 32, 3200));
        componentList.add(new RAM("Corsair Vengeance LPX 64GB", 299.99, 10, 64, 3200));
        // gpu
        componentList.add(new GraphicsCard("NVIDIA GeForce RTX 2080 Ti", 1199.99, 250, 11, 1350));
        componentList.add(new GraphicsCard("NVIDIA GeForce RTX 2070 Super", 499.99, 250, 8, 1605));
        componentList.add(new GraphicsCard("NVIDIA GeForce RTX 2060 Super", 399.99, 250, 8, 1470));
        // psu
        componentList.add(new PowerSupply("Corsair RMx Series RM750x", 129.99, 0, 750, "80+ Bronze"));
        componentList.add(new PowerSupply("Corsair RMx Series RM850x", 149.99, 0, 850, "80+ Bronze"));
        componentList.add(new PowerSupply("Corsair RMx Series RM1000x", 179.99, 0, 1000, "80+ Bronze"));
        // case
        componentList.add(new Case("Corsair Carbide Series 275R", 79.99, 0, "ATX Mid Tower", 2));
        componentList.add(new Case("Corsair Carbide Series 678C", 199.99, 0, "ATX Mid Tower", 6));
        componentList.add(new Case("Corsair Carbide Series 678C", 199.99, 0, "ATX Mid Tower", 0));
        // storage
        componentList.add(new Storage("Samsung 970 Evo 1TB", 169.99, 10, 1000, "M.2"));
        componentList.add(new Storage("Samsung 970 Evo 2TB", 349.99, 10, 2000, "M.2"));
        componentList.add(new Storage("Samsung 970 Evo 4TB", 749.99, 10, 4000, "HDD"));
    }

    // Endpoint to retrieve a list of components
    @GetMapping("/components")
    public List<Map<String, Object>> getComponents() {
        List<Map<String, Object>> componentInfoList = new ArrayList<>();

        for (Component component : componentList) {
            Map<String, Object> componentInfo = new HashMap<>();
            componentInfo.put("name", component.getName());
            componentInfo.put("type", component.getClass().getSimpleName());

            componentInfoList.add(componentInfo);
        }

        return componentInfoList;
    }


    // Endpoint to add a component to the cart
    @PostMapping("/cart/add")
    public void addComponentToCart(@RequestBody String componentName) {
        // search for component in componentList
        for (Component component : componentList) {
            if (component.getName().equals(componentName)) {
                cart.addComponent(component);
                break;
            }
        }
    }

    // Endpoint to get the items in the cart
    @GetMapping("/cart")
    public List<Component> getCartComponents() {
        return cart.getComponents();
    }
}
