package com.nc13.item.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewAddModel {
    private String content;
    private double rate;
    private Long user_id;
    private Long booking_id;
}
