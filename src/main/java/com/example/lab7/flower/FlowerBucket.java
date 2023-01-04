package com.example.lab7.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    public final List<FlowerPack> flowerPacks = new ArrayList<>();

    /// getPrice method
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            FlowerPack flowerPack = flowerPacks.get(i);
            price += flowerPack.getPrice();
        }
        return price;
    }

    /// add method
    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
