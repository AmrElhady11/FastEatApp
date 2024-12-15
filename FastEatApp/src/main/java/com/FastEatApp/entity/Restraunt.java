package com.FastEatApp.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "RESTAURANTS")
public class Restraunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    public Long restrauntId ;
    @Column(name = "name")
    public String name ;
    @Column(name = "description")
    public String description ;
    @Column(name = "location")
    public String location ;
    @Column( name = "create_at")
    private LocalDateTime createdAt;
    @Column( name = "update_at")
    private LocalDateTime updatedAt;
}
