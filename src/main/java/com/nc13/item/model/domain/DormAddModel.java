package com.nc13.item.model.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DormAddModel {

    private String name;

    private String description;

    private String contactNum;

    private String city;

    private String town;

    private String address;



    private Long categoryId;

    private Long usersId;

    private String status;



}
