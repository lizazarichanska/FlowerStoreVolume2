package com.example.lab7.flower;

import com.example.lab7.flower.properties.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    /// search method
    public List<FlowerBucket> search(FlowerBucket flowerBucketToSearch) {
        List<FlowerBucket> suitable = new ArrayList<>();
        for (FlowerBucket flowerBucket: flowerBuckets) {
            List<FlowerType> flowerTypes = new ArrayList<>();
            List<String> flowerColors = new ArrayList<>();
            for (FlowerPack flowerPack: flowerBucket.flowerPacks) {
                flowerTypes.add(flowerPack.getFlower().getType());
                flowerColors.add(flowerPack.getFlower().getColor());
            }
            double price = flowerBucket.getPrice();
            if (price > flowerBucketToSearch.getPrice()) {
                continue;
            }
            for (FlowerPack flowerPack: flowerBucketToSearch.flowerPacks) {
                FlowerType flowerTypeToSearch = flowerPack.getFlower().getType();
                if (!flowerTypes.contains(flowerTypeToSearch)) {
                    continue;
                }
                if (!flowerColors.contains(flowerTypeToSearch)) {
                    continue;
                }
                else {
                    suitable.add(flowerBucket);
                }
            }
        }
        return suitable;
    }
}
