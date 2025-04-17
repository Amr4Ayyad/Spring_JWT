package com.amr.journey.JWTDemo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    @NotNull
    private String userName;
    @Column(name = "password")
    @NotNull
    private String password;


    public User(@NotNull String userName, String encode) {
        this.userName = userName;
        this.password = encode;
    }
}
