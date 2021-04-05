package com.coachdemo.springdemo;

public class FootBallCoach implements Coach{

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Football fs setter");
		this.fortuneService=fortuneService;
	}



	public FootBallCoach() {
		//super();
		System.out.println("Football no arg const");
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Complete 50 laps";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}



}
