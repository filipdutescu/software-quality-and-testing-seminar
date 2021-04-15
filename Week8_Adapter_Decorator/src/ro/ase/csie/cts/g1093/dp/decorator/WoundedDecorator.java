package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.AcmeCharacter;

public class WoundedDecorator extends AcmeDecorator
{
  private static final int MIN_POINTS = 200;

  public WoundedDecorator(AcmeCharacter character)
  {
    super(character);
  }

  @Override
  public void move()
  {
    if (_character.getHealthPoints() < MIN_POINTS)
    {
      System.out.println("You can't move. Is critical wounded.");
    }
    else
    {
      _character.move();
    }
  }
}
