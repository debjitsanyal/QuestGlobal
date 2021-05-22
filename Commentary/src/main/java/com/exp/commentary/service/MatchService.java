package com.exp.commentary.service;

import com.exp.commentary.model.Commentary;
import com.exp.commentary.model.Matchinfo;

public interface MatchService {

	public Matchinfo createMatch(Matchinfo matchinfo);
	
	public Boolean runningCommentary(Commentary commentary);
		
		
}
