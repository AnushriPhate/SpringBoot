package com.Spring.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {


//    @Autowired
//    @Qualifier("cat")
    Animal animal;

    @Autowired //if wanna use qualifier at constructor use it like this
    public Person(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }
    public void playWithAnimal()
    {
        animal.play();
    }
}
