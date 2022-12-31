package ua.edu.ucu.demo.Flowers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController @RequestMapping
public class FlowerBucketController {
//    @Autowired
    private FlowerBucketService service;
    FlowerBucketController(FlowerBucketService bucketservice){
        service=bucketservice;
        service.createbuckets();
    }

//    @PostMapping
    public void addBucket(@RequestBody FlowerBucket bucket){
        service.addBucket(bucket);
    }

//    @GetMapping
    public List<FlowerBucket> getBuckets() {
        return service.GetBuckets();
    }
}
