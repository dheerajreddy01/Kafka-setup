package com.example.demo.consumer;

import com.example.demo.model.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "order-topic", groupId = "springboot-group")
    public void consume(OrderEvent event) {
        System.out.println("Consumed: " + event);
    }
}