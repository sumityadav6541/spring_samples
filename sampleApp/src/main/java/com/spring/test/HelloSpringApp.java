package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*ICoach theCoach = context.getBean("myCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();*/
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		ICoach theCoach2 = context.getBean("myCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getInfo());
		context.close();
	}
	
}
