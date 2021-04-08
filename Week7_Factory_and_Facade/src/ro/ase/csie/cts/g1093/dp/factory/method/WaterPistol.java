package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;

public class WaterPistol extends AbstractWeapon {

	public WaterPistol(String color, int power) {
		super(color, power);
	}

	@Override
	public void pewPew() {
		System.out.println("Water pistol go pew splash");
	}

}
