package com.dhuyo.car.oop;

import java.util.Scanner;

public class InputCarData extends ValuesSetterGetter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Input Car Information
		System.out.println("Enter Car Information");
		System.out.print("Enter Car Name : ");
		String name = input.next();
		System.out.print("Enter Car Number : ");
		int number = input.nextInt();
		System.out.print("Enter No Of Tyers : ");
		int tyers = input.nextInt();
		System.out.print("Enter Honk : ");
		String honk = input.next();
		System.out.print("Enter Speed No : ");
		int speed = input.nextInt();
		System.out.print("Enter Body Type : ");
		String body = input.nextLine();
		System.out.print("Enter Reason Why You Use Car : ");
		String use = input.nextLine();
		//Create Object
		InputCarData carData = new InputCarData();
		//Set Data
		carData.setName(name);
		carData.setNumber(number);
		carData.setTyers(tyers);
		carData.setHonk(honk);
		carData.setSpeed(speed);
		carData.setBody(body);
		carData.setUse(use);
		//Get Data
		System.out.println();
		System.out.println("Car Name : " + carData.getName());
		System.out.println("Car Number : " + carData.getNumber());
		System.out.println("Car Tyers : " + carData.getTyers());
		System.out.println("Car Honk : " + carData.getHonk());
		System.out.println("Car Speed : " + carData.getSpeed());
		System.out.println("Car Body Type : " + carData.getBody());
		System.out.println("Car Uses : " + carData.getUse());
		
		
		
		
		
	}
}
