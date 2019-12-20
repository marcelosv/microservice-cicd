package com.marcelosouzav.udemy.microservicecicd.send.gateway.client;

import com.marcelosouzav.udemy.microservicecicd.send.gateway.json.Message;
import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class SmsClientFallback implements FallbackFactory<SmsClient> {
    @Override
    public SmsClient create(Throwable throwable) {
        return new SmsClient() {
            @Override
            public void receive(Message message) {
                log.info("Erro ao enviar o sms:" + throwable.getMessage());
            }
        };
    }
}
