package com.example.KafkaMessageLogger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KafkaMessageLogger.model.User;
import com.example.KafkaMessageLogger.service.KafkaUserProducer;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
    private KafkaUserProducer producer;

    @PostMapping
    public String postUser(@RequestBody User user) {
        producer.sendUser(user);
        return "User sent to Kafka topic!";
    }
}
