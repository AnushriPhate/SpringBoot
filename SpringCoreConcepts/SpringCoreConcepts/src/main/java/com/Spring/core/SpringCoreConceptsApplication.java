package com.Spring.core;

import com.Spring.core.couple.*;
import com.Spring.core.scope.Pepsi;
import com.Spring.core.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import otherPackage.Trial;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Spring.core","otherPackage"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
//		Person personBean = context.getBean(Person.class);
//		personBean.playWithAnimal();
//
//		Trial trialBean = context.getBean(Trial.class);
//		trialBean.testing();

//		Animal cat = context.getBean("cat", Animal.class);
//		Animal dog = context.getBean("dog", Animal.class);
//		cat.play();
//		dog.play();

		//Bean scope
		//first request
//		Pepsi bean = context.getBean(Pepsi.class);
//		System.out.println(bean);
////		bean.drink();
//
//		//second request
//		Pepsi bean1 = context.getBean(Pepsi.class);
//		System.out.println(bean1);

//		Pepsi pepsi = context.getBean(Pepsi.class);
//		System.out.println(pepsi);
//		Soda soda = pepsi.getSoda();
//		System.out.println(soda);
//
//		Pepsi pepsi1 = context.getBean(Pepsi.class);
//		System.out.println(pepsi1);
//		Soda soda1 = pepsi.getSoda();
//		System.out.println(soda1);
//
//		Pepsi pepsi2 = context.getBean(Pepsi.class);
//		System.out.println(pepsi1);
//		Soda soda2 = pepsi.getSoda();
//		System.out.println(soda1);
	}
//	@Bean(name = "samosa1")
////	@Primary
//	public Samosa getSamosa1() {
//		return new Samosa("Tandori Samosa");
//	}
//
//	@Bean(name = "samosa2")
////	@Primary
//	public Samosa getSamosa2() {
//		return new Samosa("Khatta Samosa");
//	}

//	@Bean
//	public Samosa getSamosa2() {
//		return new Samosa();
//	}


}
