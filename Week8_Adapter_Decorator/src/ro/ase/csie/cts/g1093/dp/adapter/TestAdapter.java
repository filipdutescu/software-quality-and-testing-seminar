package ro.ase.csie.cts.g1093.dp.adapter;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter
{
  public static void main(String[] args)
  {
    AcmeCharacter dragon = new FantasyCharacter("Blue dragon", 1000);
    dragon.move();
    dragon.takeAHit(50);
    dragon.heal(100);

    IDisneyActions donaldDuck = new DonaldDuck("Donald Duck", 1200);
    donaldDuck.losePower(20);
    donaldDuck.recoverPower(40);
    donaldDuck.changeLocation(-20, 50);

    List<AcmeCharacter> characters = new ArrayList<>();
    characters.add(dragon);
    characters.add(new DisneyToAcmeAdapter(donaldDuck));

    for(AcmeCharacter c : characters)
    {
      c.move();
      c.takeAHit(140);
      c.heal(100);
    }
  }
}
