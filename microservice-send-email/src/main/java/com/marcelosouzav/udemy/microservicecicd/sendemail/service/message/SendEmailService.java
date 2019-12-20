package com.marcelosouzav.udemy.microservicecicd.sendemail.service.message;

import com.marcelosouzav.udemy.microservicecicd.sendemail.gateway.json.Message;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SendEmailService {

    private static final String identificador = UUID.randomUUID().toString();
    private static int cont = 0;

    public void execute(Message message) throws InterruptedException {
       // Thread.sleep(2000);
        cont++;
        System.out.println("Instância " + identificador + ", Mensagem: " + cont + ", Enviando email para: " + message.getClient());
    }
}
