package com.dhuyo.vehicle.honda;

public class DisplayDashVeelarTruck extends DashVeelar {
	public static void main(String[] args) {
		DisplayDashVeelarTruck hondaTruck = new DisplayDashVeelarTruck();
		System.out.println("Company : " + hondaTruck.brand);
		hondaTruck.body();
		hondaTruck.engine();
		hondaTruck.honk();
		hondaTruck.breaks();
		hondaTruck.tyres();
		hondaTruck.use();

	}
}
