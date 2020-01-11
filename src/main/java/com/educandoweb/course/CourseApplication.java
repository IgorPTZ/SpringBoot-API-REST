package com.educandoweb.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Application Flow: Application -> Resource Layer (rest controllers) -> Service Layer -> Data Access Layer (data repositories)

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
