package com.spring.test.sampleApp3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		ICoach coach = context.getBean("baseballCoach",ICoach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		context.close();
	}
}
