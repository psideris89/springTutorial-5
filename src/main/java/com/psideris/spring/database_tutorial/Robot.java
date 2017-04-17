package com.psideris.spring.database_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id = "Default id";
	private String speech = "Default speech";
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}
	
	@Autowired
	public void setId(@Value("${jdbc.user}") String id) {
		this.id = id;
	}
	
	@Autowired
	public void setSpeech(@Value("${jdbc.password}") String speech) {
		this.speech = speech;
	}
}
