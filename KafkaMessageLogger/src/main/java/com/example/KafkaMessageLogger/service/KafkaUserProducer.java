package com.example.KafkaMessageLogger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.KafkaMessageLogger.model.User;

@Service
public class KafkaUserProducer {
	private static final String TOPIC = "user-topic";

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	public void sendUser(User user) {
		kafkaTemplate.send(TOPIC, user);
	}
}
