package com.dhuyo.vehicle.toyota;

public class DisplayEightVeelarTruck extends EightVeelar {
	public static void main(String[] args) {
		DisplayEightVeelarTruck eightVeelar = new DisplayEightVeelarTruck();
		System.out.println("Company : " + eightVeelar.brand);
		eightVeelar.body();
		eightVeelar.engine();
		eightVeelar.honk();
		eightVeelar.breaks();
		eightVeelar.tyres();
		eightVeelar.use();

	}
}
