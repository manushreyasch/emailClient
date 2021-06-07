package com.tul;

import com.tul.emailClient.emailSenderService;
import com.tul.emailClient.toMailData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailClientApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(EmailClientApplication.class, args);
	}

	@Autowired
	private emailSenderService service;

	@Autowired
	private toMailData toMail;

	@Override
	public void run(String... args) throws Exception {
		service.sendSimpleEmail(toMail.getToMail(), toMail.getBody(), toMail.getSubject());
		System.out.println(toMail.getToMail() + " " + toMail.getBody() +  " " + toMail.getSubject());

	}
}
