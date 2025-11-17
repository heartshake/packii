package com.packii;

class Delivery {
    String studentName;
    String deliveryCompany;

    public Delivery(String studentName, String deliveryCompany) {
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