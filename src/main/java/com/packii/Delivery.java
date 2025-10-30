package com.packii;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Delivery {
    public String studentName;
    public String deliveryCompany;
    public String status;

    public Delivery() {
    }

    public Delivery(String studentName, String deliveryCompany, String status) {
        this.studentName = studentName;
        this.deliveryCompany = deliveryCompany;
        this.status = status;
    }
}