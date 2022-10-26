package com.dhuyo.vehicle.honda;
import  com.dhuyo.vehicle.toyota.Vehicle;
public class Honda extends Vehicle {
	protected String brand = "HONDA";

	protected void engine() {
		System.out.println("Honda Truck Engine");
	}

	protected void tyres() {
		System.out.println("Honda Truck Tyres");
	}

	protected void honk() {
		System.out.println(" Honda Truck Honk");
	}

	protected void breaks() {
		System.out.println("Honda Truck  Breaks");
	}

	protected void body() {
		System.out.println("Honda Truck  Body \n  STEEL");
	}

}
