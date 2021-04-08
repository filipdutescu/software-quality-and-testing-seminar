package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;

public class WaterBaloon extends AbstractWeapon {

	public WaterBaloon(String color, int power) {
		super(color, power);
	}

	@Override
	public void pewPew() {
		System.out.println("Water baloon go splash splash");
	}

}
