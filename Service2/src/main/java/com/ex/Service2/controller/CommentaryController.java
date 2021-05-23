package com.ex.Service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ex.Service2.model.Commentary;
import com.ex.Service2.model.Matchinfo;
import com.ex.Service2.model.service.CommentaryListener;

import reactor.core.publisher.Flux;

@RequestMapping("/")
public class CommentaryController {
	
	@Autowired
	private CommentaryListener commentaryListener;
	
	public Flux<Commentary> getCommentary(@RequestParam Matchinfo match ){
		
		return commentaryListener.ListenCommantry(match.getKafkaTopic());
		
	}

}
