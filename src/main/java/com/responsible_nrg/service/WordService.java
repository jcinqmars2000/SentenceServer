package com.responsible_nrg.service;

import com.responsible_nrg.domain.Word;

import rx.Observable;

public interface WordService {

	Observable<Word> getSubject();
	Observable<Word> getVerb();
	Observable<Word> getArticle();
	Observable<Word> getAdjective();
	Observable<Word> getNoun();	

}