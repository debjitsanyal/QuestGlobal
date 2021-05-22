package com.exp.commentary.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exp.commentary.model.Commentary;
import com.exp.commentary.model.Matchinfo;
import com.exp.commentary.service.MatchService;

@RestController
public class CommentaryController {
	
	private final Logger LOGGER = LogManager.getLogger(CommentaryController.class);
	
	@Autowired
	private MatchService matchService;

	/**
	 * This will create Topic per match
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/match")
	public ResponseEntity<Matchinfo> createMatch(@RequestBody Matchinfo matchInfo) {
		LOGGER.info(matchInfo);
		matchInfo = matchService.createMatch(matchInfo);
		return new ResponseEntity<>(matchInfo,  HttpStatus.OK);
	}
	
	/**
	 * This API to push running commentary
	 * @return
	 */

	@RequestMapping(method = RequestMethod.POST, value = "/commentary")
	public ResponseEntity<Boolean> runningCommentary(@RequestBody Commentary commentary) {
		LOGGER.info(commentary);
		matchService.runningCommentary(commentary);
		return new ResponseEntity<>(true,  HttpStatus.OK);
	}
}
