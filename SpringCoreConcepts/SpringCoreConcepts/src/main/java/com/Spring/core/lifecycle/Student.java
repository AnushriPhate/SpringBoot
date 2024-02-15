package com.Spring.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("student3")
public class Student {
    public Student()
    {
        System.out.println("#: Creating STudent");
    }

    @PostConstruct
    public void postconstruct(){
        System.out.println("#: Student bean is created: created()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Bye bye student bean: destroy()");
    }
}
