package com.example.creditdemo.Respository;

import com.example.creditdemo.Model.Checkstatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckstatusRepo  extends JpaRepository<Checkstatus,Integer>
{
    
}
