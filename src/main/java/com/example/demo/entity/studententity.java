package.com.example.demo.entity

@Entity


public class studententity{
    private Integer id;
    private String user;
    private String email;
    private String password;
    private Date date;
}
public Integer getId() {return id;}
public void setId(Integer id) {this.id=id;}

public String getUser() {return user;}
public void setUser(String user) {this.user=user}

public String getEmail() {return email;}
public void setEmail(String email) {this.email=email}

public String getPassword() {return password;}
public void setPassword(String password) {this.password=password}

public Date getUser() {return date;}
public void setUser(Date date) {this.date=date}

public void main(Integer id, String user,String email,String password,Date date){
    this.id=id;
    this.user=user;
    this.email.email;
    this.password=password;
    this.date=date;
}