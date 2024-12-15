package com.FastEatApp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "user_id")
    private Long userId;
    @Column( name = "email")
    private String email;
    @Column( name = "username")
    private String username;
    @Column( name = "password")
    private String password;
    @Column( name = "create_at")
    private LocalDateTime createdAt;
    @Column( name = "update_at")
    private LocalDateTime updatedAt;


}
