package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.validationservice;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.validationentity;
import com.example.demo.repository.validationrepository;

@Service
public class validationserviceimpl implements validationservice{
    @Autowired validationrepository validation;
    @Override
    public validationentity postValue(validationentity vau){
        return validation.save(vau);
    }

}