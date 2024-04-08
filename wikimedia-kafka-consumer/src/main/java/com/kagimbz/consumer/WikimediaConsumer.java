package com.kagimbz.consumer;

import com.kagimbz.data.WikimediaData;
import com.kagimbz.data.WikimediaDataRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikimediaConsumer {
    private final WikimediaDataRepo wikimediaDataRepo;

    @KafkaListener(topics = "wikimedia-data", groupId = "wikimediaConsumerGroup")
    public void subscribe(String eventMessage) {
        log.info("Event Message Received by Consumer --> {}", eventMessage);

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setData(eventMessage);
        wikimediaDataRepo.save(wikimediaData);
    }
}
