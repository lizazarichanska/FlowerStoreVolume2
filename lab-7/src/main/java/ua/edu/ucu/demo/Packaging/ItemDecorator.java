package ua.edu.ucu.demo.Packaging;

import ua.edu.ucu.demo.Item;

abstract class ItemDecorator extends Item {

    public ItemDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
