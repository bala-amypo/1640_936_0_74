package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice;
import java.util.List;
import com.example.demo.repository.studentrepo;
import org.springframework.web.bind.annotation.PathVariable;

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
      @Override
    public List<studententity> getAllData(){
     return student.findAll();
    }
    public String DeleteData(@PathVariable int id){
        student.deleteById();
        return "Deleted Successfully";
    }
}