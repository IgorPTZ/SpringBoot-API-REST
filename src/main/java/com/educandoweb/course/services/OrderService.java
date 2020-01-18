package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

//Application Flow: Application -> Resource Layer (rest controllers) -> Service Layer -> Data Access Layer (data repositories)

// A notation @Service permite cadastrar uma classe para que seja injetada automaticamente nas dependencias
@Service
public class OrderService {
	// A notation autowired realiza a injeção de dependecias automaticamente
	
	@Autowired 
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> Order = repository.findById(id);
		return Order.get();
	}
}
