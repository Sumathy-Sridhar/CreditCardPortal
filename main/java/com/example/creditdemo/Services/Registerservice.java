package com.example.creditdemo.Services;

import javax.transaction.Transactional;
//import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.creditdemo.Model.Register;
import com.example.creditdemo.Respository.RegisterRepo;

@Service
@Transactional
public class Registerservice 
{
 @Autowired
 private static RegisterRepo registerRepo;
    
    public static Register save(Register registertable)
    {
        return registerRepo.save(registertable);
    }
    
}
