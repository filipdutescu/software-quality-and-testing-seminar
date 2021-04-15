package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.AcmeCharacter;

public class ArmourDecorator extends AcmeDecorator
{
  private int _armourLevel;

  public ArmourDecorator(AcmeCharacter character, int armourLevel)
  {
    super(character);
    _armourLevel = armourLevel;
  }

  @Override
  public void takeAHit(int healthPoints)
  {
    int lostPoints = healthPoints - _armourLevel;

    if (lostPoints > 0)
    {
      _character.takeAHit(lostPoints);
    }
  }
}
