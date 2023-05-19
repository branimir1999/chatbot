package dip.fer.hr.chatbot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    public DatabaseController() {}

    @PostMapping("/write")
    public String write() {
        return "Works!";
    }

    @GetMapping("/get")
    public String get() {
        return "Works!";
    }
}
