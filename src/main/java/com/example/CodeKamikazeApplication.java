package com.example;

public class CodeKamikazeApplication {
    public static String getWelcomeMessage() {
        return "Welcome to CodeKamikaze";
    }

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
    }
}

package com.example.codekamikaze;

public class HelloService {
    public String sayHello() {
        return "Hello, There!";
    }
}
