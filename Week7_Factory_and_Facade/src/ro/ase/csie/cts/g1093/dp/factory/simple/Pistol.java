package ro.ase.csie.cts.g1093.dp.factory.simple;

public class Pistol extends AbstractWeapon {

	public Pistol(String color, int power) {
		super(color, power);
	}

	@Override
	public void pewPew() {
		System.out.println("Pistol go pew pew.");
	}

}
