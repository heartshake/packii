package com.packii;

public class FindDelivery {

    public Delivery findBy(String studentName, String deliveryCompany) {
        return new Delivery(studentName, deliveryCompany);
    }
}
