package com.example.demo.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice;
@RestController
public class studentcontroller{
        @Autowired studentservice ser;

        @PostMapping("/post")
        public studententity sendData(@RequestBody studententity stu){
            return ser.postdata(stu);
        }

}