package com.radha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringBootOauth2GithubExampleApplication {

	@GetMapping("/")
	public String message(Principal principal){
		return "Hi "+principal.getName();
	}

	@GetMapping("/callback")
	public String callback(Principal principal){
		return "callback "+principal.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauth2GithubExampleApplication.class, args);
	}

}
