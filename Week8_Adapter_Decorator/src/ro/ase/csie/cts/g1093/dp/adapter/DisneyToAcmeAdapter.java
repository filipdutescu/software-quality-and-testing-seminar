package ro.ase.csie.cts.g1093.dp.adapter;

public class DisneyToAcmeAdapter extends AcmeCharacter
{
  private IDisneyActions _character = null;

  public DisneyToAcmeAdapter(IDisneyActions character)
  {
    super(character.getName(), character.getPowerLevel());

    _character = character;
  }

  @Override
  public void move()
  {
    _character.changeLocation(0, 0);      
  }

  @Override
  public void takeAHit(int healthPoints)
  {
    _character.losePower(healthPoints);      
  }

  @Override
  public void heal(int healthPoints)
  {
    _character.recoverPower(healthPoints);
  }
}
