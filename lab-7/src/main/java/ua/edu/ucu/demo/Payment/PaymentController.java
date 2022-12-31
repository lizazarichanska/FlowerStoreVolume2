package ua.edu.ucu.demo.Payment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.Delivery.Delivery;
import ua.edu.ucu.demo.Delivery.PostDelivery;

import java.util.List;

@RestController
@RequestMapping("api/payment")
public class PaymentController {

    private List<Payment> payments = List.of(new PayPallPayment());

    @GetMapping
    public List<Payment> getPayments(){
        return payments;

}
}
