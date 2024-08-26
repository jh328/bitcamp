package com.nc13.item.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Table(name = "wish")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WishEntity {

    @Id
    private Long id;


}
