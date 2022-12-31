package ua.edu.ucu.demo.Flowers;


import ua.edu.ucu.demo.Item;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private double price = 0.0;
    private ArrayList<Flower> flowers = new ArrayList();

    public FlowerBucket(String descr) {
        super(descr);
    }

    void add(Flower fl) {
        flowers.add(fl);
        price+=fl.getPrice();
    }
    public double price() {
        return this.price;
    }

    boolean searchFlower(Flower flower) {
        for (Flower fl : flowers) {
            if (fl.getClass().getName() == flower.getClass().getName()) {
                return true;
            }

        }
        return false;
    }

}