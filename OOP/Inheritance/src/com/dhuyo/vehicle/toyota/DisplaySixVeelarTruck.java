package com.dhuyo.vehicle.toyota;

public class DisplaySixVeelarTruck extends SixVeelar {
	public static void main(String[] args) {
		DisplaySixVeelarTruck sixVeelar = new DisplaySixVeelarTruck();
		System.out.println("Company : " + sixVeelar.brand);
		sixVeelar.body();
		sixVeelar.engine();
		sixVeelar.breaks();
		sixVeelar.honk();
		sixVeelar.tyres();
		sixVeelar.use();
	}

}
