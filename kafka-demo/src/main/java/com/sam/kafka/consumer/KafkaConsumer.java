package com.sam.kafka.consumer;

import com.sam.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "sam", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from sam Topic:: %s", msg));
    }

    @KafkaListener(topics = "sam1", groupId = "myGroup1")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from sam Topic:: %s", student.toString()));
    }
}
