package com.javaprojects.basicproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicprojectApplication implements CommandLineRunner {

	@Autowired
	Apple apple;

//	@Autowired
//	Apple apple2;

	@Autowired
	DbService dbService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BasicprojectApplication.class, args);
		System.out.println("App Started..");
//		SpringApplication.exit(context);
	}

	@Override
	public void run(String... args) throws Exception {
		dbService.connectDb();
		apple.eatApple();
//		apple2.eatApple();
	}

}
