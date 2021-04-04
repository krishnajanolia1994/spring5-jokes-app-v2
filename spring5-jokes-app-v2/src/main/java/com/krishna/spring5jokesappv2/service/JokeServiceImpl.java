package com.krishna.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	

	public JokeServiceImpl() {
		super();
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}



	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
