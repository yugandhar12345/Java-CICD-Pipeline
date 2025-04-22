package com.example.codekamikaze;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodeKamikazeApplicationTests {

    @Test
    void testWelcomeMessage() {
        CodeKamikazeApplication app = new CodeKamikazeApplication();
        assertEquals("Welcome to CodeKamikaze", app.getWelcomeMessage());
    }
}
