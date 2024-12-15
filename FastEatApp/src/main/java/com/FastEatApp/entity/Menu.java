package com.FastEatApp.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "MENUS")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int menuId;
    @Column(name = "description")
    public String description ;
    @Column( name = "create_at")
    private LocalDateTime createdAt;
    @Column( name = "update_at")
    private LocalDateTime updatedAt;
}
