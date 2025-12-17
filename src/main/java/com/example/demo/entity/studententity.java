package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class studententity{
    @Id
    @GeneartedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String user;
    private String email;
    private String password;
    private Date date;

    public Integer getId() {
        return id;
        }
    public void setId(Integer id) {
        this.id=id;
        }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user=user;
        }

    public String getEmail() {
        return email;
        }
    public void setEmail(String email) {
        this.email=email;
        }

    public String getPassword() {
        return password;
        }
    public void setPassword(String password) {
        this.password=password;
        }

    public Date getDate() {
        return date;
        }
    public void setDate(Date date) {
        this.date=date;
        }

    public studententity(Integer id, String user,String email,String password,Date date){
    this.id=id;
    this.user=user;
    this.email=email;
    this.password=password;
    this.date=date;
    }
    public studententity(){
        
    }
}