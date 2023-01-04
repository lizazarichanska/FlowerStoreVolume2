package com.example.lab7.flower.decorators;

import com.example.lab7.flower.Flower;
import com.example.lab7.flower.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription(Item item) {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 4 + super.item.getPrice();
    }
}
