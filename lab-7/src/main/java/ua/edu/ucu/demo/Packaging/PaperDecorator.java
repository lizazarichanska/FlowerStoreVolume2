package ua.edu.ucu.demo.Packaging;

import ua.edu.ucu.demo.Item;

public class PaperDecorator extends ItemDecorator{
    private Item item;
    public PaperDecorator(Item itm){
        super(itm.getDescription());
        item=itm;
    }

    @Override
    public double price() {
        return (13 + item.price());
    }

    @Override
    public String getDescription() {
        return "This is paper";
    }
}
