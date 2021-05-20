package ro.ase.csie.cts.g1093.dp.memento;

import java.util.Date;

public class HeroMemento {
	String _name;
	int _lifePoints;
	String _magic;
	
	Date _timestamp;

	public HeroMemento(String name, int lifePoints, String magic) {
		_name = name;
		_lifePoints = lifePoints;
		_magic = magic;
		_timestamp = new Date();
	}
	
}
