package net.minchev.primaryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"net.minchev.importproject"})
public class PrimaryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimaryProjectApplication.class, args);
	}

}
