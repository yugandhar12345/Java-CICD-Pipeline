
package com.codekamikaze;

import static org.junit.Assert.*;
import org.junit.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.mockito.*;

public class WelcomeServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    PrintWriter writer;

    WelcomeServlet servlet;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        servlet = new WelcomeServlet();
        Mockito.when(response.getWriter()).thenReturn(writer);
    }

    @Test
    public void testDoGet() throws Exception {
        servlet.doGet(request, response);
        Mockito.verify(writer).println("<h1>Welcome to CodeKamikaze</h1>");
    }
}
