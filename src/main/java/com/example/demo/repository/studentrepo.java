package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.sterotype.Repository;

import com.example.demo.entity.studententity;
@repository
public interface studentrepo extends JpaRepository<studententity,Integer>{

}