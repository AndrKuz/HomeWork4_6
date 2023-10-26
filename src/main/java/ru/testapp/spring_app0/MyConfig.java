package ru.testapp.spring_app0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.testapp.spring_app0")
public class MyConfig {
	
	@Bean
	public HelloBean helloBean() {
		return new HelloBean("Hello");
	}
}
