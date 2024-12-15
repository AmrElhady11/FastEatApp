package com.FastEatApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDER_ITEMS")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_items_id")
    private int cartId;
    @Column(name ="quantity")
    private int quantity;
    @Column(name = "status")
    private String status;

}
