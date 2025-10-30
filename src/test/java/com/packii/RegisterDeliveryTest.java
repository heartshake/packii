package com.packii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegisterDeliveryTest {

    RegisterDelivery registerDelivery = new RegisterDelivery();
    FindDelivery findDelivery = new FindDelivery();

    @Test
    @DisplayName("택배를 등록한다.")
    void register_delivery() {
        // 학생 정보(이름)를 입력한다.
        String studentName = "김승원";
        // 택배사 이름(예: CJ, 롯데, 한진, 우체국)을 입력한다.
        String deliveryCompany = "CJ 대한통운";

        Delivery delivery = new Delivery(studentName, deliveryCompany);

        // 택배를 저장한다.
        registerDelivery.register(delivery);
        // 택배가 저장되었다는 것을 검증해야 함.
        Delivery foundDelivery = findDelivery.findBy(studentName, deliveryCompany);
        Assertions.assertNotNull(foundDelivery);
    }
}
