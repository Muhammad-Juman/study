package com.dhuyo.abstractVehicle;

public abstract class Vehicle {
       public abstract void honk();
       public abstract void tyres();
       public abstract void startEngine();
       
       public void breaks() {
    	   System.out.println("CheeCheee");
       }
}
