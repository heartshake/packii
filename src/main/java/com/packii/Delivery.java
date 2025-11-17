package com.packii;

import java.util.concurrent.atomic.AtomicInteger;

class Delivery {
    private static final AtomicInteger counter = new AtomicInteger(0);

    int id;
    String studentName;
    String deliveryCompany;

    public Delivery(String studentName, String deliveryCompany) {
        this.id = counter.incrementAndGet();
        this.studentName = studentName;
        this.deliveryCompany = deliveryCompany;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getDeliveryCompany() {
        return deliveryCompany;
    }
}