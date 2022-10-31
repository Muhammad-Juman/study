package com.dhuyo.abstractVehicle;

public class DisplayTruck extends Truck {
	public static void main(String[] args) {
		DisplayTruck truck = new DisplayTruck();
		truck.startEngine();
		truck.breaks();
		truck.honk();
		
	}
}
