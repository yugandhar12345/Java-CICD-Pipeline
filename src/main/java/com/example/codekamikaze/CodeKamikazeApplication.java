package com.example.codekamikaze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeKamikazeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeKamikazeApplication.class, args);
        System.out.println("Welcome to CodeKamikaze");
    }

    public String getWelcomeMessage() {
        return "Welcome to CodeKamikaze";
    }
}
