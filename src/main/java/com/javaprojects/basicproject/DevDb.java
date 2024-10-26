package com.javaprojects.basicproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DevDb implements Db {
	
	@Override
	public void connectDb() {
		System.out.println("Connected to Development Db");
	}
	
}
