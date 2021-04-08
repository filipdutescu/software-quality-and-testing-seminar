package ro.ase.csie.cts.g1093.dp.factory.simple;

public class SuperHero {
	private String _name;
	private AbstractWeapon _weapon;
	public SuperHero(String name, AbstractWeapon weapon) {
		super();
		_name = name;
		_weapon = weapon;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public AbstractWeapon getWeapon() {
		return _weapon;
	}
	public void setWeapon(AbstractWeapon weapon) {
		_weapon = weapon;
	}
}
