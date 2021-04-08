package ro.ase.csie.cts.g1093.dp.factory.simple;

public abstract class AbstractWeapon {
	private String _color;
	private int _power;
	
	public AbstractWeapon(String color, int power) {
		_color = color;
		_power = power;
	}	

	public String getColor() {
		return _color;
	}



	public void setColor(String color) {
		_color = color;
	}



	public int getPower() {
		return _power;
	}



	public void setPower(int power) {
		_power = power;
	}

	public abstract void pewPew();
}
