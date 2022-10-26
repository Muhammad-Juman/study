package com.dhuyo.vehicle.tesla;

public class DisplayTesla extends TeslaSmartTruck {
	public static void main(String[] args) {
		DisplayTesla teslaCyberTruck = new DisplayTesla();
		System.out.println("Company : " + teslaCyberTruck.brand);
		teslaCyberTruck.body();
		teslaCyberTruck.engine();
		teslaCyberTruck.cyberTruck();
		teslaCyberTruck.honk();
		teslaCyberTruck.breaks();
		teslaCyberTruck.tyres();
		teslaCyberTruck.useTruck();

	}

}
