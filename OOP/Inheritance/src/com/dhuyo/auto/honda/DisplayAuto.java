package com.dhuyo.auto.honda;

public class DisplayAuto extends HondaAuto {
	public static void main(String[] args) {
		DisplayAuto hondaAuto = new DisplayAuto();
		System.out.println("Company : " + hondaAuto.autoComapny);
		hondaAuto.body();
		hondaAuto.engine();
		hondaAuto.honk();
		hondaAuto.breaks();
		hondaAuto.use();
		hondaAuto.tyres();

	}
}
