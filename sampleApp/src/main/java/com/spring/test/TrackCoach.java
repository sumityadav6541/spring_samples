package com.spring.test;

public class TrackCoach implements ICoach {

	public TrackCoach() {
	}

	private IFortuneService fortuneService;
	
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5K.";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getInfo() {
		return null;
	}

}
