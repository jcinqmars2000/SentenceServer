package com.responsible_nrg.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.responsible_nrg.domain.Word;

@FeignClient(EurekaClientID.NOUN)
public interface NounClient {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	Word getWord();

}
