package com.example.springbootkafkatutorial.kafka;

import com.example.springbootkafkatutorial.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaConsumer {


    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user){
        log.info(String.format("Message received -> %s", user));
    }
}
