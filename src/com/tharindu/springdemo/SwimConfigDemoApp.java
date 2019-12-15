package com.tharindu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailtyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println("email"+ theCoach.getEmail());
		System.out.println("team" + theCoach.getTeam());
		// close the context
		context.close();
	}

}
