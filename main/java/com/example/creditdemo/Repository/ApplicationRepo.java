package com.example.creditdemo.Respository;
import com.example.creditdemo.Model.Application;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,Integer>
{

}
