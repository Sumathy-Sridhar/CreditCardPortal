package com.example.creditdemo.Respository;

import java.util.List;

import com.example.creditdemo.Model.creditscore;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditscoreRepo extends CrudRepository<creditscore , Long>
{

    @Query("Select obj from creditscore obj where obj.cname like %?1")
    List<creditscore> findByNameEndsWith(String chars);
 
    
}
