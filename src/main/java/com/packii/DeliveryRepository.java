package com.packii;

import java.util.List;

public interface DeliveryRepository {
    void save(Delivery delivery);
    List<Delivery> findAll();
}
