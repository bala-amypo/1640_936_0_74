package com.example.demo.service.Impl;
import org.springframework.sterotype.service;

import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice;

@Service 

public class studentserviceImpl implements studentservice {
   @Autowired studentrepo student; 
   //save()
   //findAll()
   //findById()
   //deleBy();
   //existsById(),
   @Override
    public studententity postData(studententity stu){
     return student.save(stu);
    }
}