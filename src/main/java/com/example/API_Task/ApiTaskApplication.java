package com.example.API_Task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ApiTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTaskApplication.class, args);
		System.out.println("Started...");
		// PasswordEncoder encoder = new BCryptPasswordEncoder();
		// String encodedPassword = encoder.encode("password"); // Change to your
		// desired password
		// System.out.println(encodedPassword);
	}

}
