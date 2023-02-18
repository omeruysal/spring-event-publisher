package com.example.demo.event;

import org.springframework.context.ApplicationEvent;


public class EmailEvent extends ApplicationEvent {
    public EmailEvent(Object source) {
        super(source);
    }
}
