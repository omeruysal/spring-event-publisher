package com.example.demo.controller;

import com.example.demo.model.Email;
import com.example.demo.service.EventsEmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events/send-email")
@AllArgsConstructor
public class EventsController {

    private final EventsEmailService emailService;

    @PostMapping()
    public String sendEmail(@RequestBody Email email) {
        emailService.publishSendEmailEvent(email);

        return "Email is sent to " + email.getEmail();
    }
}
