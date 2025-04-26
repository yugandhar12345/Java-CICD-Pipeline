package com.example.codekamikaze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CodeKamikazeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeKamikazeApplication.class, args);
    }
}

@RestController
class WelcomeController {
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to CodeKamikaze";
    }
}
