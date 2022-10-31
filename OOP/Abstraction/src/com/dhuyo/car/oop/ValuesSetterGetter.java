package com.dhuyo.car.oop;

public class ValuesSetterGetter extends CarOperator {
	// Private Instance Variable
	private String name;
	private int number;
	private String honk;
	private int tyers;
	private String use;
	private int speed;
	private String body;

	// Override Getter Methods
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getHonk() {
		return honk;
	}

	public int getTyers() {
		return tyers;
	}

	public String getUse() {
		return use;
	}

	public int getSpeed() {
		return speed;
	}

	public String getBody() {
		return body;
	}

	// Override Setter Method
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTyers(int tyers) {
		this.tyers = tyers;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public void setHonk(String honk) {
		this.honk = honk;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
