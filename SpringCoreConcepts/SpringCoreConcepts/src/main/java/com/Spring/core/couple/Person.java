package com.Spring.core.couple;

public class Person {

    public Person(Animal animal) {
        this.animal = animal;
    }

    Animal animal;

    public void playWithAnimal()
    {
        animal.play();
    }
}
