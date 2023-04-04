package dip.fer.hr.chatbot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    public HealthController() {}

    @GetMapping("/health")
    public String health() {
        return "Works!";
    }
}
