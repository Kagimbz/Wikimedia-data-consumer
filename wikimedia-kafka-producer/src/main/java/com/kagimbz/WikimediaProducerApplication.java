package com.kagimbz;

import com.kagimbz.producer.WikimediaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class WikimediaProducerApplication implements CommandLineRunner {
    private final WikimediaProducer producer;

    @Override
    public void run(String... args) throws Exception {
        producer.publish();
    }


    public static void main(String[] args) {
        SpringApplication.run(WikimediaProducerApplication.class, args);
    }
}