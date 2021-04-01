package ro.ase.csie.cts.g1093.dp.builder;

public class SuperHero {

  private String _name;
  private int _healthPoints;

  private boolean _isVillain;
  private boolean _isWounded;

  private IWeapon _leftWeapon;
  private IWeapon _rightWeapon;
  
  private ISuperPower _superPower;
  private ISuperPower _ultimatePower;

  public SuperHero() {
  }

  public SuperHero(String name,
      int healthPoints,
      boolean isVillan,
      boolean isWounded,
      IWeapon leftWeapon,
      IWeapon rightWeapon,
      ISuperPower superPower,
      ISuperPower ultimatePower) {
    _name = name;
    _healthPoints = healthPoints;
    _isVillain = isVillan;
    _isWounded = isWounded;
    _leftWeapon = leftWeapon;
    _rightWeapon = rightWeapon;
    _superPower = superPower;
    _ultimatePower = ultimatePower;
  }

}
