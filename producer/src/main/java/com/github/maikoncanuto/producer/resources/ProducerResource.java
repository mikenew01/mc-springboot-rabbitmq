package com.github.maikoncanuto.producer.resources;

import com.github.maikoncanuto.producer.dtos.MessageDTO;
import com.github.maikoncanuto.producer.services.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producer")
public class ProducerResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerResource.class);

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public void send(@RequestBody MessageDTO message) {
        LOGGER.info(String.format("Endpoint[send], message: %s", message.getMessage()));
        messageProducer.sendMessage(message.getMessage());
    }

}
