 package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

// Application Flow: Application -> Resource Layer (rest controllers) -> Service Layer -> Data Access Layer (data repositories)
 

 // Classe da camada de resource
 @RestController
 @RequestMapping(value ="/users")
 public class UserResource {
	 
	// A notation autowired realiza a injeção de dependecias automaticamente
	 @Autowired
	 private UserService service;
	 
	 @GetMapping
	 public ResponseEntity<List<User>> findAll() {
		 List<User> list = service.findAll();
		 
		 return ResponseEntity.ok().body(list);
	 }
	 
	 // Indica que a rota podera receber um parametro do tipo id
	 @GetMapping(value = "/{id}")
	 public ResponseEntity<User> findById(@PathVariable Long id) {
		 User user = service.findById(id);
		 
		 return ResponseEntity.ok().body(user);
	 }
}
