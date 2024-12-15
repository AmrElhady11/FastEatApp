package com.FastEatApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MEALS")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    private Long mealId;
    @Column(name ="price")
    private double price;
    @Column(name = "description")
    public String description ;

}
