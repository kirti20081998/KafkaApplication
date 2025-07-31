package com.example.KafkaMessageLogger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KafkaMessageLogger.service.MessageProducer;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	
	@Autowired
	private MessageProducer producer;

	@PostMapping
	public ResponseEntity<String> sendMessage(@RequestBody String message) {
		producer.sendMessage(message);
		return ResponseEntity.ok("Message sent to Kafka: " + message);
	}

}
