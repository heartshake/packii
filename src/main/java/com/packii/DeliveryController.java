package com.packii;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    public static List<Delivery> db = new ArrayList<>();

    @PostMapping("/register")
    public void register(@RequestBody Delivery delivery) {
        boolean isDuplicate = false;
        for (Delivery d : db) {
            if (d.getStudentName().equals(delivery.getStudentName()) &&
                    d.getDeliveryCompany().equals(delivery.getDeliveryCompany()) &&
                    d.getStatus().equals("STORED")) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            throw new RuntimeException("이미 보관 중인 택배입니다.");
        }

        delivery.setStatus("STORED");
        db.add(delivery);
    }

    @GetMapping("/all")
    public List<Delivery> getAll() {
        return db;
    }

    @GetMapping("/all-by-student")
    public List<Delivery> getAllBy(@RequestParam String studentName) {
        List<Delivery> result = new ArrayList<>();
        for (Delivery d : db) {
            if (d.getStudentName().equals(studentName)) {
                result.add(d);
            }
        }
        return result;
    }

    @PostMapping("/receive")
    public void receive(@RequestParam String studentName, @RequestParam String deliveryCompany) {
        Delivery target = null;
        for (Delivery d : db) {
            if (d.getStudentName().equals(studentName) &&
                    d.getDeliveryCompany().equals(deliveryCompany) &&
                    d.getStatus().equals("STORED")) {
                target = d;
                break;
            }
        }

        if (target != null) {
            target.setStatus("RECEIVED");
        } else {
        }
    }
}