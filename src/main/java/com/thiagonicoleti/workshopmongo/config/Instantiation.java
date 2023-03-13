package com.thiagonicoleti.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.thiagonicoleti.workshopmongo.domain.User;
import com.thiagonicoleti.workshopmongo.ropository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepositary;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepositary.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepositary.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
