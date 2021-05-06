package ro.ase.csie.cts.g1093.dp.state;

public class SuperHero {
	private static final float _criticalHealthThreshold = 50.0F;
	private static final float _woundedThreshold = 200.0F;
	
	String _name;
	float _healthPoints;
	IMoveState _moveState;
	
	public SuperHero(String name, float healthPoints) {
		super();
		_name = name;
		_healthPoints = healthPoints;
		_moveState = new NormalState();
	}
	
	public void TakeHit(float damagePoints) {
		_healthPoints -= damagePoints;
		
		if (_healthPoints < _criticalHealthThreshold) {
			_moveState = new CriticalState();
		}
		else if (_healthPoints < _woundedThreshold) {
			_moveState = new WoundedState();
		}
	}
	
	public void Heal(float healthPoints) {
		_healthPoints += healthPoints;
		
		if (_healthPoints > _woundedThreshold) {
			_moveState = new NormalState();
		}
		else if (_healthPoints > _criticalHealthThreshold) {
			_moveState = new WoundedState();
		}
	}

	public void Move() {
		if (_moveState != null) {
			_moveState.MoveAtDifferentLocation();
		}
		else {
			throw new UnsupportedOperationException();
		}
	}
}
