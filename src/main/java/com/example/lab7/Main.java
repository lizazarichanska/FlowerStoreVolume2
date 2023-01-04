package com.example.lab7;

import com.example.lab7.flower.Flower;
import com.example.lab7.flower.Item;
import com.example.lab7.flower.ItemDiscount;

public class Main {
    public static void main(String[] args) {
        Item flower = new Flower("blue", 100, 100);
        flower = new ItemDiscount(flower);
        System.out.println(flower.getPrice());
    }
}
