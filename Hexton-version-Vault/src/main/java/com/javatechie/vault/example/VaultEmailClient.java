package com.javatechie.vault.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(emailSenderService.class)
public class VaultEmailClient implements  CommandLineRunner{

	private emailSenderService emailSenderService;

	@Autowired
	private toMailData toMail;

	public VaultEmailClient(emailSenderService credential) {
		this.emailSenderService = credential;
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultEmailClient.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		emailSenderService.sendSimpleEmail(toMail.getToMail(), toMail.getBody(), toMail.getSubject());
		System.out.println(toMail.getToMail() + " " + toMail.getBody() +  " " + toMail.getSubject());

	}
}
