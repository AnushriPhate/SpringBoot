package com.Spring.core;

import com.Spring.core.couple.Animal;
import com.Spring.core.couple.Cat;
import com.Spring.core.couple.Dog;
import com.Spring.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import otherPackage.Trial;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Spring.core","otherPackage"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Animal animal = new Cat();
//		Person p = new Person(animal);
//		p.playWithAnimal();
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();

		Trial trialBean = context.getBean(Trial.class);
		trialBean.testing();

	}

}
