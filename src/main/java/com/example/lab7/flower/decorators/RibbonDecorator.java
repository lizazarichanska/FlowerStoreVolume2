package com.example.lab7.flower.decorators;

import com.example.lab7.flower.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription(Item item) {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + super.item.getPrice();
    }
}
