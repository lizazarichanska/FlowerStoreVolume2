package com.example.lab7.delivery;

public class DHLDeliveryStrategy implements Delivery {
    private final String name;
    private final String description;

    public DHLDeliveryStrategy() {
        name = "DHL";
        description = "DHL Delivery";
    }

    @Override
    public boolean deliver() {
        System.out.println("Delivered by DHL");
        return true;
    }
}
