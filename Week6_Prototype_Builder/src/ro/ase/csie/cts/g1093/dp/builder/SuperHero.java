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

  private SuperHero() {
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


  public static class SuperHeroBuilder {
    SuperHero _superHero;

    public SuperHeroBuilder(String name, int healthPoints) {
      _superHero = new SuperHero();

      _superHero._name = name;
      _superHero._healthPoints = healthPoints;
    } 

    public SuperHeroBuilder isVillan() {
      _superHero._isVillain = true;

      return this;
    }

    public SuperHeroBuilder isWounded() {
      _superHero._isWounded = true;

      return this;
    }

    public SuperHeroBuilder withLeftWeapon(IWeapon weapon) {
      _superHero._leftWeapon = weapon;

      return this;
    }

    public SuperHeroBuilder withRightWeapon(IWeapon weapon) {
      _superHero._rightWeapon = weapon;

      return this;
    }

    public SuperHeroBuilder withSuperPower(ISuperPower superPower) {
      _superHero._superPower = superPower;

      return this;
    }

    public SuperHeroBuilder withUltimatePower(ISuperPower ultimatePower) {
      _superHero._ultimatePower = ultimatePower;

      return this;
    }

    public SuperHero build() {
      return _superHero;
    }

  }
}
