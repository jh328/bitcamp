package com.nc13.item.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomAddModel {

    private String name;

    private String description;

    private int person;

    private int price;

    private String type;


    private Long dormId;


}
