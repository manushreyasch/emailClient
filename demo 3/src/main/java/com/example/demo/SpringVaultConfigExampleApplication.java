package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableConfigurationProperties(emailSenderService.class)
public class SpringVaultConfigExampleApplication implements CommandLineRunner{

	@Autowired
	public toMailData toMail;
    @Autowired

	public  emailSenderService service;

	@Autowired
	public Credential cd;

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultConfigExampleApplication.class, args);
	}

	//@EventListener(ApplicationReadyEvent.class)
	public void run(String... args) throws Exception  {
		//service.sendSimpleEmail(toMail.getToMail(), toMail.getBody(), toMail.getSubject());
		System.out.println(toMail.getToMail() + " " + toMail.getBody() +  " " + toMail.getSubject());
		System.out.println(cd.getPassword());
		System.out.println(cd.getUsername());
	}
}
