package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.AcmeCharacter;
import ro.ase.csie.cts.g1093.dp.adapter.FantasyCharacter;

public class TestDecorator
{
  public static void main(String[] args)
  {
    AcmeCharacter dragon = new FantasyCharacter("Blue dragon", 1000);
    dragon.move();
    dragon.takeAHit(100);
    dragon.heal(70);

    /*
    bad code:

    AcmeCharacter dragonWithArmour = new ArmourDecorator(dragon, 200);
    dragonWithArmour.takeAHit(300);
    */

    dragon = new ArmourDecorator(dragon, 200);
    dragon.takeAHit(300);

    dragon = new WoundedDecorator(dragon);
    dragon.takeAHit(400);
    dragon.move();

    dragon.takeAHit(700);
    dragon.move();

    AcmeCharacter dragon2 = new FantasyCharacter("Yellow dragon", 1200);
    dragon2.move();
    dragon2.takeAHit(100);
    dragon2.heal(70);
  }
}
