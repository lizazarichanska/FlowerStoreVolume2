package com.example.lab7.delivery;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostDeliveryStrategy implements Delivery {

    private final String name;
    private final String description;

    public PostDeliveryStrategy() {
        name = "Post";
        description = "Post Delivery";
    }

    @Override
    public boolean deliver() {
        System.out.println("Delivered by Post");
        return true;
    }
}
