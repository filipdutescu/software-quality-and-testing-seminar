package ro.ase.csie.cts.g1093.dp.adapter;

public class FantasyCharacter extends AcmeCharacter
{
  public FantasyCharacter(String name, int healthPoints)
  {
    super(name, healthPoints);
  }

  @Override
  public void move()
  {
    System.out.println(_name + " moved");
  }

  @Override
  public void takeAHit(int healthPoints)
  {
    _healthPoints -= healthPoints;
    System.out.println(_name + " took " + healthPoints + " as damage. Current health: " + _healthPoints);
  }

  @Override
  public void heal(int healthPoints)
  {
    _healthPoints += healthPoints;
    System.out.println(_name + " healed " + healthPoints + ". Current health: " + _healthPoints);
  }
}
