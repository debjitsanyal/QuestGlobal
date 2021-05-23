package com.ex.Service2.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.Service2.model.Commentary;

import reactor.core.publisher.Flux;
import reactor.kafka.receiver.KafkaReceiver;
import reactor.kafka.receiver.ReceiverRecord;

@Service
public class CommentaryListener {
	
	
	@Autowired
	KafkaReceiver<String,Commentary> kafkaReceiver;
	
	
	public Flux<Commentary> ListenCommantry(String topicName) {
		
		Flux<ReceiverRecord<String,Commentary>> kafkaFlux = kafkaReceiver.receive();
		 
		return kafkaFlux.log().doOnNext( r -> r.receiverOffset().acknowledge() )
		.map(ReceiverRecord::value);
		
	}

}
