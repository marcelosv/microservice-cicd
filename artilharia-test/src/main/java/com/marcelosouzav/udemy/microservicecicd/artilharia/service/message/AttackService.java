package com.marcelosouzav.udemy.microservicecicd.artilharia.service.message;

import com.marcelosouzav.udemy.microservicecicd.artilharia.gateway.json.Message;
import com.marcelosouzav.udemy.microservicecicd.serveradmin.enums.TypeMessageEnum;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Service
public class AttackService {

    @Value("${send.url}")
    private String url;

    public void execute(int qtd) {

        for( int loop=0; loop < qtd; loop++) {
            AttackRunnable attackRunnable = new AttackRunnable(loop);
            new Thread(attackRunnable).start();
        }
    }

    class AttackRunnable implements Runnable {
        int loop;
        public AttackRunnable(int loop){
            this.loop = loop;
        }

        @Override
        public void run() {
            int div = loop % 2;

            Message message = Message
                    .builder()
                    .client(div == 1? "email"+loop+"@email.com" : "48 9999 999"+loop)
                    .name("Marcelo : " + loop)
                    .type(div == 1 ? TypeMessageEnum.EMAIL.toString() : TypeMessageEnum.SMS.toString())
                    .build();

            RestTemplate restTemplate = new RestTemplate();

            log.info("Disparando request de ataque nro "+loop+"...");
            restTemplate.postForEntity(url, message, Object.class);
        }
    }

}
