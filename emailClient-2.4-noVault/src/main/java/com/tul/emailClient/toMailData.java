package com.tul.emailClient;

import org.springframework.stereotype.Component;

@Component("Data")
public class toMailData {
    private String toMail ="mchangulihouse@tataunistore.com";
    private String body= "Triggered because of cronJobFailed, do the needful";
    private String subject= "error in cronJob";

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getToMail() {
        return toMail;
    }
}
