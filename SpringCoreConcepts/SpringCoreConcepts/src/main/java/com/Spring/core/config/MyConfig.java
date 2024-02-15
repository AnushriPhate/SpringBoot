package com.Spring.core.config;

import com.Spring.core.couple.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name = "samosa1")
//	@Primary
    public Samosa getSamosa1() {
        return new Samosa("Tandori Samosa");
    }

    @Bean(name = "samosa2")
//	@Primary
    public Samosa getSamosa2() {
        return new Samosa("Khatta Samosa");
    }

//	@Bean
//	public Samosa getSamosa2() {
//		return new Samosa();
//    }
}
