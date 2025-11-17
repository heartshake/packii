package com.packii;

import org.springframework.web.bind.annotation.*;

@RestController
public class CreateDeliveryController {
    private final DeliveryRepository deliveryRepository;

    public CreateDeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @PostMapping("/deliveries")
    public void register( // JSON(string) -> Delivery . ObjectMapper
            @RequestBody Delivery delivery
    ) {
        deliveryRepository.save(delivery);
    }
}
