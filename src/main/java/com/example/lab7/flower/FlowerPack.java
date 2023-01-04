/// FlowerPack class implementation

package com.example.lab7.flower;

import com.example.lab7.flower.Flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Setter @Getter
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;

    /// getPrice method
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
