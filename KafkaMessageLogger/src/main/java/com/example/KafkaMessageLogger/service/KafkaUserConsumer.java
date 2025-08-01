package com.example.KafkaMessageLogger.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.KafkaMessageLogger.model.User;

@Service
public class KafkaUserConsumer {
	@KafkaListener(topics = "user-topic", groupId = "user-group")
    public void consume(User user) {
        System.out.println("Consumed User: " + user.getName() + ", Age: " + user.getAge());
    }
}
