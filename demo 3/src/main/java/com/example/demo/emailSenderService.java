package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("spring.mail")
public class emailSenderService{
    @Autowired
    private toMailData toMail;
    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String toMail, String body, String subject) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("changurimanu03@gmail.com");
        message.setTo(toMail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("mail sent");
    }
}