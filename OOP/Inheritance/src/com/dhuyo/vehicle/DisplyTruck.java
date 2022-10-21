package com.dhuyo.vehicle;

public class DisplyTruck {

	
	public static void main(String[] args) {
		Truck truck = new Truck();
		System.out.println(truck.brand);
		truck.tyres();
		truck.honk();
		truck.body();
		truck.speed();
		
	}
	
}
