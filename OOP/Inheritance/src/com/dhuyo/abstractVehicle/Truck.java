package com.dhuyo.abstractVehicle;

public class Truck extends Vehicle {

	@Override
	public void honk() {
		System.out.println("Pooop pooop!"); 
		
	}

	@Override
	public void tyres() {
		System.out.println("There are 6 tyres");
		
	}

	@Override
	public void startEngine() {
		System.out.println("Zurrrrr Zurrrrr!");		
	}

}
