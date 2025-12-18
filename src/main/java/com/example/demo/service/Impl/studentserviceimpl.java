package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice;
import com.example.demo.repository.studentrepo;


@Service 

public class studentserviceimpl implements studentservice {
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