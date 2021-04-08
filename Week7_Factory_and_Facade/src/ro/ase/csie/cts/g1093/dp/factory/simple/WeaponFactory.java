package ro.ase.csie.cts.g1093.dp.factory.simple;

public final class WeaponFactory {
	public static AbstractWeapon getWeapon(WeaponType weaponType, String color) {
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
