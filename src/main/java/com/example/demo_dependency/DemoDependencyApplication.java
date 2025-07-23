package com.example.demo_dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoDependencyApplication.class, args);
		Student o= context.getBean(Student.class);
		o.stu();
	}

}
