package com.example.creditdemo.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="status")
public class Checkstatus 
{

    @Override
    public String toString() {
        return "Checkstatus [id=" + id + ", referncenumber=" + referncenumber + ", statusupdate=" + statusupdate + "]";
    }

    public Checkstatus(String referncenumber, String statusupdate) {
        this.referncenumber = referncenumber;
        this.statusupdate = statusupdate;
    }
    public Checkstatus()
    {

    }
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    public String getReferncenumber() {
        return referncenumber;
    }

    public void setReferncenumber(String referncenumber) {
        this.referncenumber = referncenumber;
    }

    public String getStatusupdate() {
        return statusupdate;
    }

    public void setStatusupdate(String statusupdate) {
        this.statusupdate = statusupdate;
    }

    @Column(name="referncenumber",nullable = false,unique = true)
    private String referncenumber;

    @Column(name="statusupdate",nullable = false,unique = true)
    private String statusupdate;
}
