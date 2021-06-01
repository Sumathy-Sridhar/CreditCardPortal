package com.example.creditdemo.Services;

import javax.transaction.Transactional;

import com.example.creditdemo.Model.Application;
import com.example.creditdemo.Respository.ApplicationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Applicationservice 
{
    @Autowired
 private ApplicationRepo applicationRepo;
    
    public void save(Application applicationtable)
    {
        applicationRepo.save(applicationtable);
    }
    public Application get(int id){
        return (Application) applicationRepo.findById(id).get();
    }
    
    
}
