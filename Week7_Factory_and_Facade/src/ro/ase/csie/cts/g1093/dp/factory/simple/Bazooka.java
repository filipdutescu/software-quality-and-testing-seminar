package ro.ase.csie.cts.g1093.dp.factory.simple;

public class Bazooka extends AbstractWeapon {
	private int _maxDistance;
	
	public Bazooka(String color, int power, int maxDistance) {
		super(color, power);
		
		_maxDistance = maxDistance;
	}

	public int getMaxDistance() {
		return _maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		_maxDistance = maxDistance;
	}

	@Override
	public void pewPew() {
		System.out.println("Bazooka go pew pew");
	}

}
