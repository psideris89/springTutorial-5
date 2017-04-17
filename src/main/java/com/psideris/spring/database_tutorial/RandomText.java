package com.psideris.spring.database_tutorial;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {

	private static String[] texts = {
			"Text version 1",
			"Text version 2",
			"Text version 3"
	};
	
	public String getRandomText() {
		return texts[new Random().nextInt(texts.length)];
	}
}
