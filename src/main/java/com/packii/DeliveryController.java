package com.packii;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeliveryController {
    static List<Delivery> deliveries = new ArrayList<>();

    @PostMapping("/register")
    public void register(
            @RequestParam String studentName,
            @RequestParam String deliveryCompany
    ) {
        Delivery delivery = new Delivery(studentName, deliveryCompany);
        deliveries.add(delivery);
    }
}
