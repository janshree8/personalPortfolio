package com.portfolio.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class PersonalApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersonalApplication.class, args);
	}


}
