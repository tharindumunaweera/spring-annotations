package com.tharindu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return "TODAY IS TOUR LUCKY DAY";
	}

}
