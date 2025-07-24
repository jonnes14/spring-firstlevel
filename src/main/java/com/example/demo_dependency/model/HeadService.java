package com.example.demo_dependency.model;

import org.springframework.stereotype.Service;

@Service
public class HeadService {

    public void addHead(Teacher teacher){
        System.out.println("hello from headService");
    }
}
