package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

//Application Flow: Application -> Resource Layer (rest controllers) -> Service Layer -> Data Access Layer (data repositories)

// A notation @Service permite cadastrar uma classe para que seja injetada automaticamente nas dependencias
@Service
public class CategoryService {
	// A notation autowired realiza a injeção de dependecias automaticamente
	
	@Autowired 
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> user = repository.findById(id);
		return user.get();
	}
}
