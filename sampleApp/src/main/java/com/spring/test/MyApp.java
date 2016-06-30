package com.spring.test;

public class MyApp {
	public static void main(String[] args) throws Exception, Throwable {

		ICoach coach = new TrackCoach();

		System.out.println(coach.getDailyWorkout());

	}
}
