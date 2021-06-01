package com.example.creditdemo.Services;

import javax.transaction.Transactional;

import com.example.creditdemo.Model.Application;
import com.example.creditdemo.Respository.ApplicationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class fetchapplication 
{
    @Autowired
    private ApplicationRepo apprepo;
    public Iterable<Application> fetchAllData()
    {
       return apprepo.findAll();
    }
    
}
