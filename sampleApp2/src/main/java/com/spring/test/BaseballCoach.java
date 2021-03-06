package com.spring.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myCoach")
@Component
@Scope("singleton")
public class BaseballCoach implements ICoach {

	@Autowired
	@Qualifier("happyFortuneService2")
	private IFortuneService fortuneService ;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private int team;

	public BaseballCoach() {
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	//@Autowired
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("Inside the setter method of no-arg constructor");
		this.fortuneService = fortuneService;
	}

	public BaseballCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getInfo() {
		return "Info: " + team + " " + email;
	}

	@PostConstruct
	public void baseBallInIt(){
		System.out.println("It is the custom initialization method for base ball coach");
	}
	
	@PreDestroy
	public void baseBallDestroy(){
		System.out.println("It is the custom Destroy method for base ball coach");
	}
}
