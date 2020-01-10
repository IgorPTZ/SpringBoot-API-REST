 package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

// Flow: Application -> Resource Layer (rest controllers) -> Service Layer -> Data Access Layer (data repositories)

 @RestController
 @RequestMapping(value ="/users")
 public class UserResource {
	 
	 @GetMapping
	 public ResponseEntity<User> findAll() {
		 User user = new User(1L, "Igor", "igor.ptz@hotmail.com", "71987034333", "teste321");
		 return ResponseEntity.ok().body(user);
	 }
}
