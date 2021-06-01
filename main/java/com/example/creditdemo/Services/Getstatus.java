package com.example.creditdemo.Services;

import javax.transaction.Transactional;

import com.example.creditdemo.Model.Checkstatus;
import com.example.creditdemo.Respository.CheckstatusRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Getstatus 
{
    @Autowired
    private CheckstatusRepo  statusrepo;
    public Iterable<Checkstatus> fetchAllData()
    {
       return statusrepo.findAll();
    }
    
}
