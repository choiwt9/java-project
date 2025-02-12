package com.kh.ch09_interface;

public class Monstera extends Plant {

	public Monstera(String name) {
		this.name = name;
	}

	@Override
	public void sprinkleWater() {
		int n = getNutrients();
		setNutrients(n + 10);
	}

	@Override
	public void baskSun() {
		setNutrients(getNutrients() + 20);
	}

	public String toString() {
		return "name = " + name + ", nutrients" + getNutrients();
	}
}
