package com.spring.test;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService2 implements IFortuneService {

	public String getFortune() {
		return "Today is your very lucky day!";
	}

}
