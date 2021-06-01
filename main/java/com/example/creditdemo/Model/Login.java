package com.example.creditdemo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class Login {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
    @Column(name="username",nullable = false,unique = true)
    private String uname;
    @Column(name="password")
    private String pwd;
    @Column(name="repassword")
    private String repwd;
    public String getRepwd() {
        return repwd;
    }

    public void setRepwd(String repwd) {
        this.repwd = repwd;
    }

    public String getUname() {
        return uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "Login [id=" + id + ", pwd=" + pwd + ", uname=" + uname + ", repwd=" + repwd + "]";
    }


}
