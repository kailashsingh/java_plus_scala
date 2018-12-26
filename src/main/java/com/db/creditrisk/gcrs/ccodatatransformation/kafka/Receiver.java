package com.db.creditrisk.gcrs.ccodatatransformation.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	@KafkaListener(topics = "orch.cco")
	public void receive(String payload) {
		LOGGER.info("received payload='{}'", payload);
	}
}
