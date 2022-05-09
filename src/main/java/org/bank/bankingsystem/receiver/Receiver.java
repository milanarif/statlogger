package org.bank.bankingsystem.receiver;

import org.bank.bankingsystem.config.JmsConfig;
import org.bank.bankingsystem.entity.LoginEntity;
import org.bank.bankingsystem.messaging.model.MessageObject;
import org.bank.bankingsystem.repository.LoginRepository;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private final LoginRepository loginRepository;

    public Receiver(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @JmsListener(destination = JmsConfig.LOGIN_QUEUE)
    public void listen(@Payload MessageObject messageObject) {
        System.out.println("Received message: " + messageObject);
        loginRepository.save(new LoginEntity(messageObject.getUsername(), messageObject.getLocalDatetime()));
    }

}