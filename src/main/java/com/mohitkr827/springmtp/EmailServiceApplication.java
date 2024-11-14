package com.mohitkr827.springmtp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class EmailServiceApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        System.setProperty("MAILTRAP_USERNAME", dotenv.get("MAILTRAP_USERNAME"));
        System.setProperty("MAILTRAP_PASSWORD", dotenv.get("MAILTRAP_PASSWORD"));
        SpringApplication.run(EmailServiceApplication.class, args);
    }
}