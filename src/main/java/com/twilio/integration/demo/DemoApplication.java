package com.twilio.integration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.twilio.Twilio;
import com.twilio.integration.demo.config.TwilioConfig;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

	@Autowired
	private TwilioConfig config;

	@PostConstruct
	public void setup(){
		Twilio.init(config.getSid(), config.getAuthToken());
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
