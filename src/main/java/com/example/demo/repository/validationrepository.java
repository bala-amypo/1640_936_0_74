package com.example.demo.repository;

import org.springframework.stereotype.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.validationentity;


@Repository
public interface validationrepository extends JpaRepository<validationentity,Long>{
    
}