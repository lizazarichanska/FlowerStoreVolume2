package ua.edu.ucu.demo.Flowers;

import java.util.List;

public class FlowerBucketService {

    private List <FlowerBucket> buckets;

    public void createbuckets(){

        Flower flower1 = new CactusFlower(3, "cactus", 5, "green", 45);

        Flower flower2 = new CactusFlower(4, "cactus", 3, "green", 35);

        Flower flower3 = new RomashkaFlower(5, "romashka", 50, "yellow", 23);

        Flower flower4 = new RomashkaFlower(6, "romashka", 72, "white", 27);

        FlowerBucket bucket1 = new FlowerBucket("bucket1");

        FlowerBucket bucket2 = new FlowerBucket("bucket2");

        bucket1.add(flower1);
        bucket1.add(flower3);

        bucket2.add(flower2);
        bucket2.add(flower4);

        buckets = List.of(bucket1, bucket2);

    }
    public void addBucket(FlowerBucket bucket){
        buckets.add(bucket);
    }
    public List<FlowerBucket> GetBuckets(){
        return buckets;
    }
}
