package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.validationservice;
import com.example.demo.entity.validationentity;
import com.example.demo.controller.validationcontroller;

@RestController
public class validationcontroller{
    @Autowired validationservice ser;
    @PostMapping("/userdatas")
    public validationentity sendDatas(@Valid @RequestBody validationentity vau){
        return ser.postValue(vau);
    }
}