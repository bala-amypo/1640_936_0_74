package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.validationservice;


@RestController
public class ValidationController
{
    @Autowired ValidationService sere;
    @PostMapping("/userdatas")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity vau){
        return sere.postValue(vau);
    }
}