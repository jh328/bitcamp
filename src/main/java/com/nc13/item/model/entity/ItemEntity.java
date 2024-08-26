package com.nc13.item.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="itmes")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    private int price;
}

