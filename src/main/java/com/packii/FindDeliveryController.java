package com.packii;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindDeliveryController {
    final DeliveryRepository deliveryRepository;

    public FindDeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @GetMapping("/deliveries") // http://localhost:8080/deliveries
    public List<Delivery> findAll() { // Delivery -> JSON(string) . ObjectMapper
        return deliveryRepository.findAll(); // 2.
    }
}
