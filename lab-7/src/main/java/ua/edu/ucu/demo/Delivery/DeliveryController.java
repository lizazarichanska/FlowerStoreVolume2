package ua.edu.ucu.demo.Delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/delivery")
public class DeliveryController {
    private List<Delivery> deliveries = List.of(new PostDelivery());

    @GetMapping
    public List<Delivery> getDeliveries(){
        return deliveries;
    }
}
