package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

// Classe apenas para configurações de testes

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	// Injeção de dependecia
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// Tudo que estiver dentro desse metodo ser executado quando a aplicacao for iniciada
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com","988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
