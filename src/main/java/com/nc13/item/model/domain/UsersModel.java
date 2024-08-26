package com.nc13.item.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersModel {
    private Long id;
    private String email;
    private String password;
    private String name;
    private int phoneNum;
    private String status;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;


}
