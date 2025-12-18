package com.example.demo.studentcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.studententity;
import com.example.demo.service.studentservice;
@RestController
public class studentcontroller{
        @Autowired studentservice ser;

        @PostMapping("/post")
        public studententity sendData(@RequestBody studententity stu){
            return ser.postData(stu);
        }
    @GetMapping("/get")
    public List<studententity>getData(){
        return ser.getAllData();
    }
    @DeleteMapping("/Delete/{id}")
     public String DeleteForm(@PathVariable int id){
        return ser.D
     }
}