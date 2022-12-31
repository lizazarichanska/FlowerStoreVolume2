package ua.edu.ucu.demo.Delivery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.Item;

import java.util.List;


public class Delivery {

    public void deliver(List<Item> items){
        System.out.println("items are delivered");
    }
}
