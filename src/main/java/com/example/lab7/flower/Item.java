package com.example.lab7.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private String description;

    public abstract double getPrice();
}
