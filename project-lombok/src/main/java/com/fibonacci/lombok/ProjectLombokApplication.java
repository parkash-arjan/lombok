package com.fibonacci.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectLombokApplication implements CommandLineRunner {

	@Autowired
	private LombokEntity entity;

	public static void main(String[] args) {
		SpringApplication.run(ProjectLombokApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		entity.setName("I am lambokk entity");
		System.out.println("Entity Name = " + entity.getName());

	}
}
