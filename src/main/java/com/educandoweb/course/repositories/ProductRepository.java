package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.Product;

// Classe Repository, desponibiliza varias operacoes de BD (select, insert, update e delete)

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
