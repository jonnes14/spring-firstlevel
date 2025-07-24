package com.example.demo_dependency;

import com.example.demo_dependency.model.HeadService;
import com.example.demo_dependency.model.Student;
import com.example.demo_dependency.model.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoDependencyApplication.class, args);
//		Student o= context.getBean(Student.class);
//		o.stu();
		HeadService service=context.getBean(HeadService.class);
		Teacher t=context.getBean(Teacher.class);
		service.addHead(t);
	}

}
