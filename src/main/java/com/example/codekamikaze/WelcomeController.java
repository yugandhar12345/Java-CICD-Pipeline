package com.example.codekamikaze;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WelcomeController {
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to CodeKamikaze";
    }
}
