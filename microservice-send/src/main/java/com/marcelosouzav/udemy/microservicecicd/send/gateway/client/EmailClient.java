package com.marcelosouzav.udemy.microservicecicd.send.gateway.client;

import com.marcelosouzav.udemy.microservicecicd.send.gateway.json.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "EmailClient", url = "${email.server.url}", fallbackFactory = EmailClientFallback.class)
public interface EmailClient {

    @PostMapping(value = "/receive")
    void receive(Message message);

}
