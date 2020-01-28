package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.OrderItem;

// Classe Repository, desponibiliza varias operacoes de BD (select, insert, update e delete)

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
