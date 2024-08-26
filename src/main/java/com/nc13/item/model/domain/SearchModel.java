package com.nc13.item.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class SearchModel {
    private String city;


    private LocalDateTime checkIn;


    private LocalDateTime checkOut;
    private int person;

    @Builder
    public SearchModel(String city, LocalDateTime checkIn, LocalDateTime checkOut, int person) {
        this.city = city;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
//        this.checkIn = LocalDateTime.parse(checkIn).withHour(15).withMinute(0).withSecond(0).withNano(0);
//        this.checkOut = LocalDateTime.parse(checkOut).withHour(11).withMinute(0).withSecond(0).withNano(0);
//        this.checkIn = checkIn.withHour(15).withMinute(0).withSecond(0).withNano(0);
//        this.checkOut = checkOut.withHour(11).withMinute(0).withSecond(0).withNano(0);

//        this.checkIn = new java.sql.Timestamp(checkIn.getTime()).toLocalDateTime();
//        this.checkOut = new java.sql.Timestamp(checkOut.getTime()).toLocalDateTime();

//        this.checkIn = LocalDateTime.parse(checkIn.formatted("yyyy-MM-dd HH:mm:ss")).withHour(15).withMinute(0).withSecond(0);
//        this.checkOut = LocalDateTime.parse(checkOut.formatted("yyyy-MM-dd HH:mm:ss")).withHour(11).withMinute(0).withSecond(0);
//        this.checkOut = LocalDateTime.parse(checkOut, formatter).withHour(11).withMinute(0).withSecond(0);
        this.person = person;
    }
}
