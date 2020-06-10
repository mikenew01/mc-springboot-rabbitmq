package com.github.maikoncanuto.consumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);


    public void onMessage(String message) {
        LOGGER.info(String.format("Consumer, message: %s", message));
    }


}
