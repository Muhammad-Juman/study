package com.dhuyo.abstractVehicle;

public  class Car extends Vehicle{
	
	@Override
	public void honk() {
		System.out.println("Beeep,Beep");
	}
	
	@Override
	public void tyres() {
		System.out.println("There are four tyres");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Turrrr Turrrr!");
	}
 
	@Override
	public void breaks() {
		System.out.println("Installed new breakes");
	}
	 
}
