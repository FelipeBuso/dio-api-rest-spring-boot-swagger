package dio.spring_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {
    @GetMapping
    public String welcomer() {
        return "Welcome to My Spring Boot Web API";
    }
}
