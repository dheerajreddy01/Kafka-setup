package com.example.demo.controller;


import com.example.demo.model.OrderEvent;
import com.example.demo.producer.OrderProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderProducer producer;

    public OrderController(OrderProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrderEvent event) {
        producer.sendOrder(event);
        return ResponseEntity.ok("Order event sent to Kafka");
    }
}
