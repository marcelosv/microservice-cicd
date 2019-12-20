package com.marcelosouzav.udemy.microservicecicd.send.gateway.client;

import com.marcelosouzav.udemy.microservicecicd.send.gateway.json.Message;
import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class EmailClientFallback implements FallbackFactory<EmailClient> {
    @Override
    public EmailClient create(Throwable throwable) {
        return new EmailClient() {
            @Override
            public void receive(Message message) {
                log.info("Erro ao enviar o email:" + throwable.getMessage());
            }
        };
    }
}
