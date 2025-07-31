package com.example.KafkaMessageLogger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "message_topic";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }

}
