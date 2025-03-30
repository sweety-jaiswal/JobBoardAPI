package com.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My API", version = "1.0", description = "API Documentation"))
public class SpringbootmvcMongodbApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcMongodbApplication.class, args);
	}

}
