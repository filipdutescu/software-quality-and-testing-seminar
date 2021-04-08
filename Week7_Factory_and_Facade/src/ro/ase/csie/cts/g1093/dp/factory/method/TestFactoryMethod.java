package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.factory.simple.Pistol;
import ro.ase.csie.cts.g1093.dp.factory.simple.WeaponType;

public class TestFactoryMethod {

	public static void main(String[] args) {
		boolean isWaterMode = true;
		
		AbstractWeapon weapon = null;
		if (isWaterMode) {
			weapon = new WaterPistol("red", 0);
		}
		else {
			weapon = new Pistol("red", 50);
		}
		
		weapon.pewPew();
		
		AbstractWeaponFactory factory = isWaterMode ? new ToyWeaponFactory() : new RealWeaponFactory();
		weapon = factory.getWeapon(WeaponType.PISTOL, "magenta");
	}

}
