package com.javaprojects.basicproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
//	@Scope(value="prototype")
	public Apple getApple() {
		return new Apple();
	}
}
