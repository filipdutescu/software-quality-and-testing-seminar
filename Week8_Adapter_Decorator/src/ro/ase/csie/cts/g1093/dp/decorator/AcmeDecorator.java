package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.AcmeCharacter;

public abstract class AcmeDecorator extends AcmeCharacter
{
  protected AcmeCharacter _character = null;

  public AcmeDecorator(AcmeCharacter character)
  {
    super(character.getName(), character.getHealthPoints());
    _character = character;
  }

  @Override
  public void move()
  {
    _character.move();
  }

  @Override
  public void takeAHit(int healthPoints)
  {
    _character.takeAHit(healthPoints);    
  }

  @Override
  public void heal(int healthPoints)
  {
     _character.heal(healthPoints); 
  }

  @Override
  public int getHealthPoints()
  {
    return _character.getHealthPoints();
  }
}
