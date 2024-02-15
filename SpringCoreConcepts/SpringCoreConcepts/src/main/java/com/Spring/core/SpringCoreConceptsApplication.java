package com.Spring.core;

import com.Spring.core.couple.Animal;
import com.Spring.core.couple.Cat;
import com.Spring.core.couple.Dog;
import com.Spring.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
		Animal animal = new Cat();
		Person p = new Person(animal);
		p.playWithAnimal();
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
