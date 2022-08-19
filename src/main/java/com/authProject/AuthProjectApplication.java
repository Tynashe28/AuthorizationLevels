package com.authProject;

import com.authProject.models.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AuthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthProjectApplication.class, args);
	}

}
