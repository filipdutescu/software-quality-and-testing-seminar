package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;

public class WaterBucket extends AbstractWeapon {

	public WaterBucket(String color, int power) {
		super(color, power);
	}

	@Override
	public void pewPew() {
		System.out.println("Water bucket go splash splash");
	}

}
