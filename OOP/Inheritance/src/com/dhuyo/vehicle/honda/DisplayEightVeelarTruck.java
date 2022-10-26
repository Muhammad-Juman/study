package com.dhuyo.vehicle.honda;

public class DisplayEightVeelarTruck extends EightVeelar {
	public static void main(String[] args) {
		DisplayEightVeelarTruck hondaTruck = new DisplayEightVeelarTruck();
		System.out.println("Company : " + hondaTruck.brand);
		hondaTruck.body();
		hondaTruck.engine();
		hondaTruck.honk();
		hondaTruck.breaks();
		hondaTruck.use();
		hondaTruck.tyres();
	}

}
