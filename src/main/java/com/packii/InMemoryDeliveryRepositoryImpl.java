package com.packii;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDeliveryRepositoryImpl implements DeliveryRepository {
    private List<Delivery> deliveries = new ArrayList<>();

    @Override
    public void save(Delivery delivery) {
        deliveries.add(delivery);
    }

    @Override
    public List<Delivery> findAll() {
        return deliveries;
    }
}
