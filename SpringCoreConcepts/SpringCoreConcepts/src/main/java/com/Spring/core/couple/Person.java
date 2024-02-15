package com.Spring.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    //field injection
    @Autowired
    Animal animal;
    @Autowired
    Student student;

    @Autowired
    @Qualifier("samosa1")
    Samosa samosa;

    public Animal getAnimal() {
        return animal;
    }

    //setter based injection
//    @Autowired
    public void setAnimal(Animal animal) {
        System.out.println("setting animal");
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

//    @Autowired
    public void setStudent(Student student) {
        System.out.println("setting animal");
        this.student = student;

    }

    //constructor based injection
//    @Autowired
//    public Person(Animal animal, Student student) {
//        System.out.println("calling constructor..autowiring");
//        this.animal = animal;
//        this.student = student;
//    }
    public void playWithAnimal()
    {
        animal.play();
        student.detail();
        samosa.eat();
    }
}
