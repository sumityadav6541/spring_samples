package com.spring.test.sampleApp3;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}
