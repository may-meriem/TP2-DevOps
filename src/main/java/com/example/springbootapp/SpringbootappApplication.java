package com.example.springbootapp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class SpringbootappApplication {

	@RequestMapping("/")
    public String home() {
    	return "Bonjour";
  	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}

}
