package com.enseirb.myapp.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class kafkaReceiver {
    private final Logger log = (Logger) LoggerFactory.getLogger(kafkaReceiver.class);
    @KafkaListener(id = "city", topics = "cities")
    public void received(String city){
        log.info("city received {}", city);
    }
}
