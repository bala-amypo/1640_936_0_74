package com.example.demo.entity;
import jakarta.persistence.Entity;
@Entity
public class validationentity{
    @id
    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;


}