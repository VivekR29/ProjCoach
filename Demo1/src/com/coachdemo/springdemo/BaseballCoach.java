package com.coachdemo.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub

		this.fortuneService=fortuneService;

	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
