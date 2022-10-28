package com.dhuyo.abstractVehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle c = new Car();
		c.honk();
		c.breaks();
		
		Vehicle t = new Truck();
		t.honk();
		
		
		Car cc = new Car();
		cc.honk();
		
		Truck tt = new Truck();
		tt.honk();
		tt.breaks();
		

	}

}
