package com.example.demo.entity;
import lombok.Data;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Timestamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

@PrePersist
    
public void Oncreate(){
    
      this.createdAt=now;
      this.updatedAt=now;
}
@PreUpdate
    LocalDateTime now= LocalDateTime().now();
public void Afterupdate(){
    
    this.updatedAt=now;
}
}