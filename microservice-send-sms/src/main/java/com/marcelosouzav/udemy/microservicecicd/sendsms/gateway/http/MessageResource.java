package com.marcelosouzav.udemy.microservicecicd.sendsms.gateway.http;

import com.marcelosouzav.udemy.microservicecicd.sendsms.gateway.json.Message;
import com.marcelosouzav.udemy.microservicecicd.sendsms.service.message.SendSMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class MessageResource {

    @Autowired
    private SendSMSService sendSMSService;

    @PostMapping(value = "/receive")
    public void receive(@RequestBody  @Valid @NotNull Message message) throws InterruptedException {
        sendSMSService.execute(message);
    }

}
