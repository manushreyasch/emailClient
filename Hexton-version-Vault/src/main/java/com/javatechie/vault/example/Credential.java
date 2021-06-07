package com.javatechie.vault.example;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("spring.mail")
public class Credential {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
