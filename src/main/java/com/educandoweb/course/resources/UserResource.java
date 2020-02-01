package com.educandoweb.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	 
	 @PostMapping
	 public ResponseEntity<User> insert(@RequestBody User user) {
		 user = service.insert(user);
		 
		 URI uri = ServletUriComponentsBuilder.
				   fromCurrentRequest().path("/{id}").
				   buildAndExpand(user.getId()).toUri();
		 
		 return ResponseEntity.created(uri).body(user);
	 }
	 
	 @DeleteMapping(value = "/{id}")
	 public ResponseEntity<Void> delete(@PathVariable Long id) {
		 service.delete(id);
		 return ResponseEntity.noContent().build();
	 }
	 
	 @PutMapping(value = "/{id}")
	 public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
		 user = service.update(id, user);
		 return ResponseEntity.ok().body(user);
	 }
	 
}
