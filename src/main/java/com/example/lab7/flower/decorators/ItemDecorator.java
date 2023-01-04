package com.example.lab7.flower.decorators;

import com.example.lab7.flower.Item;

public abstract class ItemDecorator extends Item {
    public Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public abstract String getDescription(Item item);
}
