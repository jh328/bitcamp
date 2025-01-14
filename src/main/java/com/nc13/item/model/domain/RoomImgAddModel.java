package com.nc13.item.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomImgAddModel {

    private String name;

    private String nameOriginal;

    private String size;

    private String ext;


    private Long roomId;


}
