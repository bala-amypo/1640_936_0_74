package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.ValidationEntity;

public interface ValidationService{
    ValidationEntity vpostData(ValidationEntity stu);
        //StudentEntity getData(); 
    List<StudentEntity>get();
    // String DeleteData(int id);
    // StudentEntity getData(int id);
    // StudentEntity updateData(int id,StudentEntity entity);

}
