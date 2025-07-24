package com.example.demo_dependency.model;

import org.springframework.stereotype.Component;

@Component
public class Professors implements Head {
    public void paper(){
        System.out.println("this is proff");
    }
}
