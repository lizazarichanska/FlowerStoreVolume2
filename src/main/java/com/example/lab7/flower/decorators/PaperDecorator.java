package com.example.lab7.flower.decorators;

import com.example.lab7.flower.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription(Item item) {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 13 + super.item.getPrice();
    }
}
