package com.example.demo.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.webbind.annotation.PostMapping;
import org.springframework.webbind.annotation.RestController;
@RestController
public class studentcontroller{
        @Autowired studentservice ser;

        @PostMapping("/post")
        public studententity sendData(@RequestBody studententity stu){
            return ser.postdata(stu);
        }

}