package com.nc13.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ItemModel {

    private Long id;
    private String name;
    private int price;

}
