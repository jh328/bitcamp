package com.nc13.item.model.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@ToString
@Table(name = "amenity")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AmenityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 댓글 고유

    private String name;

    @Builder
    public AmenityEntity(Long id , String name){
        this.id = id;
        this.name = name;

    }
}
