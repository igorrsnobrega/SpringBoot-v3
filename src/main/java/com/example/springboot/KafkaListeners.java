package com.example.springboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "example", groupId = "foo")
    void listener(String data) {

        System.out.println("listener recived " + data + " ");

    }

}
