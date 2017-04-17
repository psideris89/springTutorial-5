package com.psideris.spring.annotation_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id = 0;
	private String speech = "hello";
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}
	
	@Autowired
	public void setId(@Value("1007") int id) {
		this.id = id;
	}
	
	@Autowired
	public void setSpeech(@Value("Hola amigo") String speech) {
		this.speech = speech;
	}
}
