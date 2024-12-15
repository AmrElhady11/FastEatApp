package com.FastEatApp.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "description")
    public String description ;
    @Column( name = "create_at")
    private LocalDateTime createdAt;
    @Column( name = "update_at")
    private LocalDateTime updatedAt;
}
