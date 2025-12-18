package com.example.demo.entity;
import jakarta.persistence.Entity;
@Entity
public class validationentity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 character")
    private String username;
    @email(message="Email")
    private String email;
    private String password;
    private int age;


}