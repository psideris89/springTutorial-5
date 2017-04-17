package com.psideris.spring.SPEL_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Robot {

	private int id = 0;
	private String speech = "hello";
	
	@Autowired
	private RandomText randomText;
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSpeech(String speech) {
		//this.speech = randomText.getRandomText();
		this.speech = speech;
	}
}
