package com.exp.commentary.service;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.exp.commentary.dao.MatchRepository;
import com.exp.commentary.entity.MatchEntity;
import com.exp.commentary.model.Commentary;
import com.exp.commentary.model.Matchinfo;
import com.google.gson.Gson;

public class MatchServiceImpl implements MatchService {
	
	@Autowired
    private MatchRepository matchRepository;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Override
	@Transactional
	public Matchinfo createMatch(Matchinfo matchinfo) {
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		MatchEntity matchEntity = mapper.map(matchinfo, MatchEntity.class);
		matchRepository.save(matchEntity);
		createkafkaTopic(matchEntity.getKafkaTopic());
		Matchinfo Matchinfo2 = mapper.map(matchEntity, Matchinfo.class);
		return Matchinfo2;
	}
	
	@Override
	public Boolean runningCommentary(Commentary commentary) {
		Matchinfo matchinfo = commentary.getMatchInfo();
		String topicName = matchinfo.getKafkaTopic();
		String commentaryJson = new Gson().toJson(commentary);
		kafkaTemplate.send(topicName, commentaryJson);
		return true;
	}
	

	private Boolean createkafkaTopic(String topic) {
		
//		<< Implementation of Kafka topic creation >
		return true;
	}

}
