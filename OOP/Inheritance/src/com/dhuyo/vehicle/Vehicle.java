package com.dhuyo.vehicle;

public class Vehicle {
	protected String brand ="Toyota";
	protected void honk() {
		System.out.println("Beep,Beep!");
	}
	protected void honk(String sound) {
		System.out.println("Sound from Parent:"+sound);
	}
	protected void engine() {
		System.out.println("This is engine of Vehicle");
	}
	
	protected void tyres() {
		System.out.println("This is tyres of Vehicle");
	}
	
	

}
