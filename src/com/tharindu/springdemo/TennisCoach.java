package com.tharindu.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailtyWorkout() {
		// TODO Auto-generated method stub
		return "practise your back hand";
	}

}