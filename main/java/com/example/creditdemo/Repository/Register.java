package com.example.creditdemo.Respository;

import com.example.creditdemo.Model.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RegisterRepo extends JpaRepository<Register,Integer> 
{
    
}
