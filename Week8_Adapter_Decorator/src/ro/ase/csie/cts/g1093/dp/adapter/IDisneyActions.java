package ro.ase.csie.cts.g1093.dp.adapter;

public interface IDisneyActions
{
  public abstract String getName();

  public abstract int getPowerLevel();

  public abstract void losePower(int damagePoints);

  public abstract void recoverPower(int damagePoints);

  public abstract void changeLocation(int x, int y);
}
