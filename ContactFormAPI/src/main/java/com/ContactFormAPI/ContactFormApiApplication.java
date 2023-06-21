package com.ContactFormAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="ContacatForm API", version="v1.0.0", description="This a ContactForm API that sends an email notification to the owner of the site after a client has Succesfully filled in the Contact us form ."))
public class ContactFormApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactFormApiApplication.class, args);
	}

}
