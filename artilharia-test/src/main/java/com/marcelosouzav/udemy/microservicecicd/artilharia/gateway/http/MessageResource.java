package com.marcelosouzav.udemy.microservicecicd.artilharia.gateway.http;

import com.marcelosouzav.udemy.microservicecicd.artilharia.service.message.AttackService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class MessageResource {

    @Autowired
    private AttackService resendMessageService;

    @GetMapping(value = "/attack/{qtd}")
    public void attack(@PathVariable("qtd") String qtd) {
        log.info("Recebendo request de attack.");

        resendMessageService.execute(Integer.parseInt(qtd));
    }

}
