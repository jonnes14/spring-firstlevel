package com.example.demo_dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component   // component-> annotation means it automatically
// detected and registered as a Spring Bean within the application context.
public class Student {
    @Value("21")
    private int age;

    private Head head;
    public void setAge(int age){
        this.age=age;
    }
    public  int getAge(){
        return  age;
    }

    @Autowired  // autwiref annotation in Spring Boot is a core mechanism for achievingn (DI).
    // It instructs the Spring Inversion of Control (IoC)
    // container to automatically resolve and inject collaborating beans into your objects
    @Qualifier("professors")
    public void setHead(Head head){
        this.head=head;
    }
    public Head getHead(){
        return head;
    }
    public void stu(){
        head.paper();
    }
}
