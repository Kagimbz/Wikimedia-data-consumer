package com.kagimbz.producer;

import com.kagimbz.handler.WikimediaEventHandler;
import com.launchdarkly.eventsource.EventSource;
import com.launchdarkly.eventsource.background.BackgroundEventHandler;
import com.launchdarkly.eventsource.background.BackgroundEventSource;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void publish() throws InterruptedException {
        String topicName = "wikimedia-data";
        BackgroundEventHandler backgroundEventHandler = new WikimediaEventHandler(kafkaTemplate, topicName);

        String eventSourceUrl = "https://stream.wikimedia.org/v2/stream/recentchange";

        EventSource.Builder builder1 = new EventSource.Builder(URI.create(eventSourceUrl));
        BackgroundEventSource.Builder builder2 = new BackgroundEventSource.Builder(backgroundEventHandler, builder1);
        BackgroundEventSource eventSource = builder2.build();
        eventSource.start();

        TimeUnit.MINUTES.sleep(10);

    }
}
