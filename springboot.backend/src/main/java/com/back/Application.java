package com.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.back.model.User;
import com.back.repositiory.UserRepo;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("Kanchana","Sachithra","skw@gmail.com"));
		this.userRepo.save(new User("Addde","Amal","abc@gmail.com"));
		this.userRepo.save(new User("Balan","Saman","BalanSS@gmail.com"));
		
	}

}
