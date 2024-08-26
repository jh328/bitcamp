package com.nc13.item.model.domain;


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public record PaymentResponseModel(
        String paymentKey,
        String orderId,
        int totalAmount,
        String status,
        String approvedAt
) {

}
