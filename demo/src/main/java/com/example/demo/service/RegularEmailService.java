package com.example.demo.service;

import com.example.demo.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegularEmailService {

    public void sendEmail(Email email){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Email is sending to " + email.toString() + " right now");
    }
}
