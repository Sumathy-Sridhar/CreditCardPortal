package com.example.creditdemo.Model;
 import javax.persistence.CascadeType;
import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="Signup")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int regId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="app_id")
    private List<Application> ap;
    public Register(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }

    @Column(name="username",nullable = false,unique = true)
    private String username;
    @Column(name="password")
    private String password;
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Register [RegId=" + regId + ", password=" + password + ", username=" + username + "]";
    }
}
