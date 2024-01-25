package com.twilio.integration.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping(path = "/otp")
public class OtpController {
    @Value("${twilio.phoneNumber}")
    public String fromPhone;

    @PostMapping(path = "/{toPhone}")
    public String sendOtp(@PathVariable String toPhone) {
        Message message = Message
                .creator(new PhoneNumber(toPhone), new PhoneNumber(fromPhone), "testing twilio sms service").create();

        System.out.println(message.getSid());
        return "SMS sent successfully";
    }

    @GetMapping(path = "/")
    public String hello(){
        return "Hello world";
    }
}
