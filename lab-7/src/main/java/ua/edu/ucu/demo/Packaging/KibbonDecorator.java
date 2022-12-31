package ua.edu.ucu.demo.Packaging;

import ua.edu.ucu.demo.Item;

public class KibbonDecorator extends ItemDecorator{
    private Item item;
    public KibbonDecorator(Item itm){
        super(itm.getDescription());
        item=itm;
    }

    @Override
    public double price() {
        return (40 + item.price());
    }

    @Override
    public String getDescription() {
        return "This is kibbon";
    }
}
