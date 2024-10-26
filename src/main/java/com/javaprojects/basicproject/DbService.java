package com.javaprojects.basicproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {

	@Autowired
	private Db db;

	public void connectDb() {
		db.connectDb();
	}
}
