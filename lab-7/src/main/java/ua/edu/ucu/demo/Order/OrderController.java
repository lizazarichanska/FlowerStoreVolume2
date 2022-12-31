package ua.edu.ucu.demo.Order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.Delivery.PostDelivery;
import ua.edu.ucu.demo.Flowers.Flower;
import ua.edu.ucu.demo.Flowers.RomashkaFlower;
import ua.edu.ucu.demo.Item;
import ua.edu.ucu.demo.Payment.CreditCartPayment;
import ua.edu.ucu.demo.Payment.Payment;

import java.util.List;
//@RestController
//@RequestMapping("api/order")
public class OrderController {
//    @GetMapping
    public List<Order> getOrders(){
        Item item = new RomashkaFlower(2, "romashka", 50, "white", 15);
        Order order = new Order();
        order.addItem(item);
        order.setPaymentStrategy(new CreditCartPayment());
        order.setDeliveryStrategy(new PostDelivery());
        return List.of(order);

    }
}


