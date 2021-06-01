package com.example.creditdemo.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CardApplication")
public class Application 
{
    public Application(String firstname, String lastname, String age, String gender, String maritalstatus,
            String dependency, String email, String country, String city, String contactnumber, String pannumber,
            String aadharnumber, String income, String cardtype, String referncenumber) {
        
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.maritalstatus = maritalstatus;
        this.dependency = dependency;
        this.email = email;
        this.country = country;
        this.city = city;
        this.contactnumber = contactnumber;
        this.pannumber = pannumber;
        this.aadharnumber = aadharnumber;
        this.income = income;
        this.cardtype = cardtype;
        this.referncenumber = referncenumber;
    }
    public Application()
    {

    }

    @Override
    public String toString() {
        return "Application [aadharnumber=" + aadharnumber + ", age=" + age + ", cardtype=" + cardtype + ", city="
                + city + ", contactnumber=" + contactnumber + ", country=" + country + ", dependency=" + dependency
                + ", email=" + email + ", firstname=" + firstname + ", gender=" + gender + ", app_id=" + app_id + ", income="
                + income + ", lastname=" + lastname + ", maritalstatus=" + maritalstatus + ", pannumber=" + pannumber
                + ", referncenumber=" + referncenumber + "]";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPannumber() {
        return pannumber;
    }

    public void setPannumber(String pannumber) {
        this.pannumber = pannumber;
    }

    public String getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(String aadharnumber) {
        this.aadharnumber = aadharnumber;
    }    

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getReferncenumber() {
        return referncenumber;
    }

    public void setReferncenumber(String referncenumber) {
        this.referncenumber = referncenumber;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int app_id;
    
    @Column(name="firstname",nullable =false)
    private String firstname;

    @Column(name="lastname",nullable =false)
    private String lastname;

    @Column(name="age",nullable =false)
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    @Column(name="gender",nullable =false)
    private String gender;

    @Column(name="maritalstatus",nullable =false)
    private String maritalstatus;

    @Column(name="dependency",nullable =false)
    private String dependency;

    @Column(name="email",nullable =false,unique = true)
    private String email;

    @Column(name="country",nullable =false)
    private String country;

    @Column(name="city",nullable =false)
    private String city;

    @Column(name="contactnumber",nullable =false,unique = true)
    private String contactnumber;

    @Column(name="pannumber",nullable =false,unique = true)
    private String pannumber;

    @Column(name="aadharnumber",nullable =false,unique = true)
    private String aadharnumber;

    @Column(name="income",nullable =false)
    private String income;

    @Column(name="cardtype",nullable =false)
    private String cardtype;

    @Column(name="referncenumber",nullable =false,unique = true)
    private String referncenumber;
}
