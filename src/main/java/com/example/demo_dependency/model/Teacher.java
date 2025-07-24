package com.example.demo_dependency.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Teacher implements Head {
   public void paper(){
       System.out.println("this is from teacher class");
   }
}
