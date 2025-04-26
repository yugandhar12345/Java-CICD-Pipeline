package com.example.codekamikaze;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodeKamikazeApplicationTests {
    @Test
    void testWelcomeMessage() {
        assertEquals("Welcome to CodeKamikaze", CodeKamikazeApplication.getWelcomeMessage());
    }
}
