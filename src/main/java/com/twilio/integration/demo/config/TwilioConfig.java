package com.twilio.integration.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Configuration
@Data
@Component
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfig {

    private String sid;
    private String authToken;
    private String phoneNumber;
    
}
