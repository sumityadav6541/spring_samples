package com.spring.test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) throws Exception {
		
		/*Just to debug the project*/
		/*PrintWriter writer = new PrintWriter("test.txt", "UTF-8");
		writer.println("The first line");
		writer.println("The second line");
		writer.println("The third line");
		writer.close();*/
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*ICoach theCoach = context.getBean("myCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();*/
		
		
		ICoach theCoach = context.getBean("baseballCoach", ICoach.class);
		ICoach theCoach2 = context.getBean("baseballCoach", ICoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getInfo());
		context.close();
		System.out.println(theCoach==theCoach2);
	}
	
}
