package com.dhuyo.vehicle.tesla;
import com.dhuyo.vehicle.toyota.Vehicle;
public class TeslaSmartTruck extends Vehicle {
	protected String brand = "TESLA";

	protected void engine() {
		System.out.println("Tesla Smart Truck Engine : Small And TOO PowerFul");
	}

	protected void tyres() {
		System.out.println("Tesla Smart Truck Tyres : Six Tyers \n 2 Front \n 4 Back ");
	}

	protected void honk() {
		System.out.println(" Tesla Smart Truck Honk : POOO .... POOOOPPP ... POOOO");
	}

	protected void breaks() {
		System.out.println("Tesla Smart Truck  Breaks : Hybrid");
	}

	protected void body() {
		System.out.println("Tesla Smart Truck  Body \n  STEEL");
	}
	
	protected void useTruck() {
	System.out.println("Tesla Smart Truck Load Capacity : 3,500 Pounds Capacity"
			+ " and Adjustable Air Suspension ");
	}

	protected void cyberTruck() {
		System.out.println("Cyber Truck is the most powerful tool we have ever built,"
				+ " engineered with 100 cubic feet of exterior, lockable storage");
	}

}
