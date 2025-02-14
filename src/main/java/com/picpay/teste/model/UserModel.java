package com.picpay.teste.model;

import java.math.BigDecimal;

import com.picpay.teste.type.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name="users")
@Table(name="users")
@Data
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique=true)
    private String document;

    @Column(unique=true)
    private String email;

    private String password;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;
    
}
