package com.dhuyo.vehicle;

public class Car extends Vehicle{
	
	
	@Override
	protected void tyres() {
		System.out.println("There are 4 tyres in This Car");
	}
	
	
	protected void speed() {
		System.out.println("This is speed of car");
	}
	
	@Override
	protected void honk(String sound) {
		System.out.println("Car Honk");
		super.honk(sound);
	}
	

}
