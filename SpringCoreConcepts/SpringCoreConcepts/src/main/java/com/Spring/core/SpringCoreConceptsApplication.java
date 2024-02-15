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

		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();

		Trial trialBean = context.getBean(Trial.class);
		trialBean.testing();

		Animal cat = context.getBean("cat", Animal.class);
		Animal dog = context.getBean("dog", Animal.class);
		cat.play();
		dog.play();

	}

}
