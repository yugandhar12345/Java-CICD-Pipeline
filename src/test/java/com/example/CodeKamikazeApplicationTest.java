package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeKamikazeApplicationTest {

    @Test
    public void testGetWelcomeMessage() {
        String expected = "Welcome to CodeKamikaze";
        String actual = CodeKamikazeApplication.getWelcomeMessage();
        assertEquals(expected, actual, "The welcome message should match");
    }
}
