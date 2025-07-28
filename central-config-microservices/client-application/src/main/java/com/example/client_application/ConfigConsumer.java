package com.example.client_application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumer {

    @Value("${user.role}")
    private String userRole;

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String getUserRole() {
        return userRole;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}