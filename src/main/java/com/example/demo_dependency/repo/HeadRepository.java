package com.example.demo_dependency.repo;


import com.example.demo_dependency.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class HeadRepository {

    public  void save(Teacher teacher){
        System.out.println("this is from repo");
    }
}
