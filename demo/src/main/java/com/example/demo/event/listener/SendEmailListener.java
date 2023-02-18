package com.example.demo.event.listener;

import com.example.demo.event.EmailEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SendEmailListener {

    @Async
    @EventListener
    public void sendEmailHandler(EmailEvent event) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Email is sending to " + event.getSource().toString() + " right now");
    }
}
