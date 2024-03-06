package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
	@CrossOrigin("http://localhost:3000")
	@RequestMapping("/")
	public String home() {
		return "Hello world Spring Boot";
	}
	@CrossOrigin("http://localhost:3000")
	@RequestMapping("/new")
	public String nuevo(){
		return "Hello World";
	}

	@CrossOrigin("http://localhost:3000")
	@RequestMapping("/api/hello")
	public String hello(){
		return "¡Hola, Mundo!";
	}


}
