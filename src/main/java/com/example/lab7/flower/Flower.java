package com.example.lab7.flower;

import com.example.lab7.flower.properties.FlowerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Getter @Setter @AllArgsConstructor @Entity @Table @NoArgsConstructor
public class Flower extends Item {
    @GeneratedValue @Id
    private int id;
    private String color;
    private double sepalLength;
    private double price;
    @Enumerated(EnumType.STRING)
    private FlowerType type;
    private final String description = "Flower";

    public Flower(String color, double sepalLength, double price) {
        this.setColor(color);
        this.setSepalLength(sepalLength);
        this.setPrice(price);
    }
}
