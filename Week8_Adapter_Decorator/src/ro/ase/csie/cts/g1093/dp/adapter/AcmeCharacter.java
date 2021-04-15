package ro.ase.csie.cts.g1093.dp.adapter;

public abstract class AcmeCharacter
{
  protected String _name;
  protected int _healthPoints;

  public AcmeCharacter(String name, int healthPoints)
  {
    _name = name;
    _healthPoints = healthPoints;
  }

  public String getName()
  {
    return _name;
  }

  public void setName(String name)
  {
    _name = name;
  }

  public int getHealthPoints()
  {
    return _healthPoints;
  }

  public void setHealthPoints(int healthPoints)
  {
    _healthPoints = healthPoints;
  }

  public abstract void move();

  public abstract void takeAHit(int healthPoints);

  public abstract void heal(int healthPoints);
}
