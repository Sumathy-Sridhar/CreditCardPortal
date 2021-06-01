package com.example.creditdemo.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="creditscore")
public class creditscore 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name="cname")
    private String cname;
    

    @Column(name="gender")
    private String gender;

    
    @Column(name="age")
    private int age;

    @Column(name="phonenumber")
    private int phonenumber;

    @Column(name="email")
    private String email;

    
    public creditscore(int id, String cname, String gender, int age, int phonenumber, String email, int creditscore,
            int pannumber) {
        Id = id;
        this.cname = cname;
        this.gender = gender;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
        this.creditscore = creditscore;
        this.pannumber = pannumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="creditscore")
    private int creditscore;

    public String getCname() {
        return cname;
    }
    @Override
    public String toString() {
        return "creditscore [Id=" + Id + ", cname=" + cname + ", creditscore=" + creditscore + ", Age=" + age
                + ", email=" + email + ", gender=" + gender + ", pannumber=" + pannumber + ", phonenumber="
                + phonenumber + "]";
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    
    @Column(name="pannumber")
    private int pannumber;

    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    public int getCreditscore() {
        return creditscore;
    }
    public void setCreditscore(int creditscore) {
        this.creditscore = creditscore;
    }
    public int getPannumber() {
        return pannumber;
    }
    public void setPannumber(int pannumber) {
        this.pannumber = pannumber;
    }    
}
