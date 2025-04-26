package com.example.codekamikaze;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CodeKamikazeApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        // Test if the Spring application context loads successfully
    }

    @Test
    public void testWelcomeMessage() {
        // Send a GET request to the /welcome endpoint and check the response
        ResponseEntity<String> response = restTemplate.getForEntity("/welcome", String.class);
        assertEquals("Welcome to CodeKamikaze", response.getBody());
    }
}
