package ro.ase.csie.cts.g1093.dp.adapter;

public class DonaldDuck implements IDisneyActions
{
  private String _name;
  private int _powerLevel;

  public DonaldDuck(String name, int powerLevel)
  {
    _name = name;
    _powerLevel = powerLevel;
  }

  @Override
  public String getName()
  {
    return _name;
  }

  @Override
  public int getPowerLevel()
  {
    return _powerLevel;
  }

  @Override
  public void losePower(int damagePoints)
  {
    _powerLevel -= damagePoints;
    System.out.println(_name + " lost power. Current power: " + _powerLevel);
  }

  @Override
  public void recoverPower(int damagePoints)
  {
    _powerLevel += damagePoints;
    System.out.println(_name + " recovered power. Current power: " + _powerLevel);
  }

  @Override
  public void changeLocation(int x, int y)
  {
    System.out.println(_name + " moved to (" + x + ", " + y + ").");
  }
}
