package com.tharindu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println("inside the happyfortuneservice constructor");
	}
	
	@Override
	public String getFortune() {
	
		return "TODAY IS TOUR LUCKY DAY";
	}

}
