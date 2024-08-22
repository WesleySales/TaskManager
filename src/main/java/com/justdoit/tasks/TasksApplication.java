package com.justdoit.tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
