package com.dhuyo.vehicle.toyota;

public class DisplayDashVeelarTruck extends DashVeelar {
	public static void main(String[] args) {
		DisplayDashVeelarTruck dashveelar = new DisplayDashVeelarTruck();
		System.out.println("Truck Brand :" + dashveelar.brand);
		dashveelar.body();
		dashveelar.engine();
		dashveelar.breaks();
		dashveelar.honk();
		dashveelar.tyres();
		dashveelar.use();
	}

}
