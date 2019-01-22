package com.responsible_nrg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.responsible_nrg.service.SentenceService;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SentenceController {

	@Autowired 
	private SentenceService sentenceService;


	/**
	 * Display a small list of Sentences to the caller:
	 */
	@GetMapping({"/", "/sentence"})
	public @ResponseBody String getSentences() {
		return 
				"<h3>Some Sentences</h3><br/>" +	  
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>"
				;
	}
}