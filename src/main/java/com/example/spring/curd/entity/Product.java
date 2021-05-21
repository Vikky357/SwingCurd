package com.example.spring.curd.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String name;
    private Integer quantity;
    private Double price;

}
