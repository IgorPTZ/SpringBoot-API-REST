package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

//Application Flow: Application -> Resource Layer (rest controllers) -> Service Layer -> Data Access Layer (data repositories)

// A notation @Service permite cadastrar uma classe para que seja injetada automaticamente nas dependencias
@Service
public class UserService {
	// A notation autowired realiza a injeção de dependecias automaticamente
	
	@Autowired 
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.get();
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
