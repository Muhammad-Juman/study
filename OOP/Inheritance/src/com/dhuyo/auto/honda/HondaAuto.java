package com.dhuyo.auto.honda;

import com.dhuyo.vehicle.toyota.Vehicle;

public class HondaAuto extends Vehicle {
	protected String autoComapny = "Honda";
	protected void engine() {
		System.out.println("Honda Auto Engine : Normal ");
	}

	protected void tyres() {
		System.out.println("Honda Auto Tyres : 3 \n 1 Front \n 2 Back");
	}

	protected void honk() {
		System.out.println("Honda Auto Honk : POOOO...OOOPPPP");
	}

	protected void breaks() {
		System.out.println("Breaks : Normal ");
	}

	protected void body() {
		System.out.println("Body : STEEL ");
	}
	
	protected void use() {
		System.out.println("Multi Use : Import Export Normal Load And \n Many People Use To Transport");
	}


}
