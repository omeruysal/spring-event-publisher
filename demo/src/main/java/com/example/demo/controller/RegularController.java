package com.example.demo.controller;

import com.example.demo.model.Email;
import com.example.demo.service.EventsEmailService;
import com.example.demo.service.RegularEmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-email")
@AllArgsConstructor
public class RegularController {

    private final RegularEmailService emailService;

    @PostMapping()
    public String sendEmail(@RequestBody Email email) {
        emailService.sendEmail(email);
        return "Email is sent to " + email.getEmail() + " with regular way";
    }
}
