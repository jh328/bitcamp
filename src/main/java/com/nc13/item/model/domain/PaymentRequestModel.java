package com.nc13.item.model.domain;

public record PaymentRequestModel(
        String paymentKey,
        String orderId,
        int amount,
        Long userId,
        Long roomId,
        int person,
        String checkIn,
        String checkOut
) {
}
