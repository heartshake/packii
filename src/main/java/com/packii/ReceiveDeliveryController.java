package com.packii;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiveDeliveryController {
    private final DeliveryRepository deliveryRepository;
    public ReceiveDeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }


    public void receive(int id){

    }
}
