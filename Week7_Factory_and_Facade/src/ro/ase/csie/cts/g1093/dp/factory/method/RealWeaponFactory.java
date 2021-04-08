package ro.ase.csie.cts.g1093.dp.factory.method;

import ro.ase.csie.cts.g1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.dp.factory.simple.Bazooka;
import ro.ase.csie.cts.g1093.dp.factory.simple.MachineGun;
import ro.ase.csie.cts.g1093.dp.factory.simple.Pistol;
import ro.ase.csie.cts.g1093.dp.factory.simple.WeaponType;

public final class RealWeaponFactory extends AbstractWeaponFactory {
	@Override
	public AbstractWeapon getWeapon(WeaponType weaponType, String color) {
		AbstractWeapon weapon = null;
		
		switch(weaponType) {
		case BAZOOKA:
			weapon = new Bazooka(color, 250, 500);
			break;
		case MACHINEGUN:
			weapon = new MachineGun(color);
			break;
		case PISTOL:
			weapon = new Pistol(color, 50);
			break;
			
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}
}
