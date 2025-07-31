package com.example.KafkaMessageLogger.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	@KafkaListener(topics = "message_topic", groupId = "logger-group")
    public void listen(String message) {
        System.out.println("Received from Kafka: " + message);
    }
}
