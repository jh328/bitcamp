package com.nc13.item.model.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@ToString
@Table(name = "d_amenity")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DamenityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 댓글 고유

}
