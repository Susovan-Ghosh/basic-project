package com.javaprojects.basicproject;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
public class Apple {
	
	public void eatApple() {
		System.out.println("I'm eating apple");
	}
	
	@PostConstruct
	public void calledAfterBeanInjected() {
		// Initialization related
		System.out.println("This Post Construct hook is being called after the bean is created and injected.");
	}
	
	@PreDestroy
	public void calledBeforeBeanDestruction() {
		// cleanup related
		System.out.println("This Pre Destroy hook is being called just before the bean is destroyed.");
	}
}
