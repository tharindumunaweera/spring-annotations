package com.tharindu.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define default constructor
	public TennisCoach() {
		System.out.println("inside the default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartUp() {
		System.out.println("inside my doMyStartUp method");
	}
	
	@PreDestroy
	public void doMyCleanUp() {
		System.out.println("inside my doMyCleanUp method");
	}
	
	// define default setter method
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("inside the setFortuneService()");
		fortuneService = theFortuneService;
	}
	/*
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailtyWorkout() {
		// TODO Auto-generated method stub
		return "practise your back hand";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}