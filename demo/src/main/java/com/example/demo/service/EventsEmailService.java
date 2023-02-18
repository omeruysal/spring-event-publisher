package com.example.demo.service;

import com.example.demo.event.EmailEvent;
import com.example.demo.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventsEmailService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishSendEmailEvent(Email email) {
        applicationEventPublisher.publishEvent(new EmailEvent(email));
        System.out.println("it is published however it might take some time");
    }
}
