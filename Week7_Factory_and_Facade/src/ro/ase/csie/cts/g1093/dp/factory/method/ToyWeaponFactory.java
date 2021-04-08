package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.factory.simple.WeaponType;

public final class ToyWeaponFactory extends AbstractWeaponFactory {
	@Override
	public AbstractWeapon getWeapon(WeaponType weaponType, String color) {
		AbstractWeapon weapon = null;
		
		switch(weaponType) {
		case BAZOOKA:
			weapon = new WaterBucket(color, 250);
			break;
		case MACHINEGUN:
			weapon = new WaterBaloon(color, 100);
			break;
		case PISTOL:
			weapon = new WaterPistol(color, 50);
			break;
			
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}
}
