package com.marcelosouzav.udemy.microservicecicd.send.gateway.http;

import com.marcelosouzav.udemy.microservicecicd.send.gateway.json.Message;
import com.marcelosouzav.udemy.microservicecicd.send.service.message.ResendMessageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Log4j2
@RestController
public class MessageResource {

    @Autowired
    private ResendMessageService resendMessageService;

    @PostMapping(value = "/receive")
    public void receive(@Valid @NotNull @RequestBody Message message){
        log.info("Recebendo menssagem...");
        resendMessageService.execute(message);
    }

}
