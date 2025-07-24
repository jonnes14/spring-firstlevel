package com.example.demo_dependency.model;

import com.example.demo_dependency.HeadRepository;
import org.springframework.stereotype.Service;

@Service
public class HeadService {


 HeadRepository headRepository;
    public void addHead(Teacher teacher){
        headRepository.save(teacher);
    }
}
