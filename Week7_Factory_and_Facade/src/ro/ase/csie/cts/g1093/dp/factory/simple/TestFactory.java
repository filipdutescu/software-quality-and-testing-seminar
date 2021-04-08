package ro.ase.csie.cts.g1093.dp.factory.simple;

public class TestFactory {

	public static void main(String[] args) {
//		AbstractWeapon bazooka = new Bazooka("brown", 250, 500);
//		AbstractWeapon machineGun = new MachineGun("green");
//		AbstractWeapon pistol = new Pistol("blue", 50);
		
		AbstractWeapon factoryBazooka = WeaponFactory.getWeapon(WeaponType.BAZOOKA, "red");
		AbstractWeapon factoryMachineGun = WeaponFactory.getWeapon(WeaponType.MACHINEGUN, "gray");
		AbstractWeapon factoryPistol = WeaponFactory.getWeapon(WeaponType.PISTOL, "black");
		
		factoryBazooka.pewPew();
		factoryMachineGun.pewPew();
		factoryPistol.pewPew();
	}

}
