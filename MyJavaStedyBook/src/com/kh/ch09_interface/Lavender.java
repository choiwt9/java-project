package com.kh.ch09_interface;

public class Lavender extends Plant {

	public Lavender(String name) {
		this.name = name;
	}

	@Override
	public void sprinkleWater() {

		setNutrients(getNutrients() + 3);
	}

	@Override
	public void baskSun() {
		setNutrients(getNutrients() + 7);

	}

	@Override
	public String toString() {
		return "name : " + name + ", nutrients" + getNutrients();
	}

}
