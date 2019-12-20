package com.marcelosouzav.udemy.microservicecicd.send.gateway.client;

import com.marcelosouzav.udemy.microservicecicd.send.gateway.json.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "SmsClient", url = "${sms.server.url}", fallbackFactory = SmsClientFallback.class)
public interface SmsClient {

    @PostMapping(value = "/receive")
    void receive(Message message);

}
