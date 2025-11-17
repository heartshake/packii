package com.packii;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

class Delivery {
    private static final AtomicInteger counter = new AtomicInteger(0);

    int id;
    String studentName;
    String deliveryCompany;
    LocalDate deliveryDate;
    boolean isReceived;

    public Delivery(String studentName, String deliveryCompany) {
        this.id = counter.incrementAndGet();
        this.studentName = studentName;
        this.deliveryCompany = deliveryCompany;
        this.deliveryDate = LocalDate.now();
        this.isReceived = false;
    }

    public int getId() {
        return id;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getDeliveryCompany() {
        return deliveryCompany;
    }
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    public boolean isReceived() {
        return isReceived;
    }

    public void receive() {
        isReceived = true;
    }
}