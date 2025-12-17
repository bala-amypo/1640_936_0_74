package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@repository
public interface studentrepo extends JpaRepository<studententity,Integer>{

}