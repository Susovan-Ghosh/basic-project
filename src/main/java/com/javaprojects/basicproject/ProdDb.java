package com.javaprojects.basicproject;

import org.springframework.stereotype.Component;

@Component
public class ProdDb implements Db {
	
	@Override
	public void connectDb() {
		System.out.println("Connected to Production Db");
	}
	
}
