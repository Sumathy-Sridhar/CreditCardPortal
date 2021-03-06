package com.example.creditdemo.Controller;
import com.example.creditdemo.Model.Application;
import com.example.creditdemo.Services.Applicationservice;
import com.example.creditdemo.Services.fetchapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Applicationcontroller 
{
    @Autowired
    private Applicationservice applicationservice;

    @PostMapping("/application")
    public void add(@RequestBody Application applicationtable) {
        applicationservice.save(applicationtable);
    }

    @Autowired
     private fetchapplication fetchserv;
     
    @GetMapping("/application")
    public Iterable<Application> list() 
    {
        return fetchserv.fetchAllData();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Applicationcontroller.class, args);
    }

    
}
