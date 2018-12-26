package com.db.creditrisk.gcrs.ccodatatransformation.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
@EmbeddedKafka(partitions = 1, topics = { CcoDataTransformationReceiverTest.ORCH_CCO_TOPIC })
public class CcoDataTransformationReceiverTest {

	static final String ORCH_CCO_TOPIC = "orch.cco";

	@Autowired
	private Sender sender;

	@Test
	public void testReceive() throws Exception {
		sender.send("Hello Spring Kafka!");
	}
}
