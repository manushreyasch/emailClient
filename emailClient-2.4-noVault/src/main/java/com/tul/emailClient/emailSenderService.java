package com.tul.emailClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service("emailSender")
public class emailSenderService implements CommandLineRunner{
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
    @Override
    public void run(String...args) throws Exception {
        //this.sendSimpleEmail(toMail.getToMail(), toMail.getBody(), toMail.getSubject());
        System.out.println(toMail.getToMail() + " " + toMail.getBody() +  " " + toMail.getSubject());

    }

}