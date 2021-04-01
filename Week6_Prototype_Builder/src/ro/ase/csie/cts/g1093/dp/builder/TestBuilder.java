package ro.ase.csie.cts.g1093.dp.builder;

import ro.ase.csie.cts.g1093.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {
  public static void main(String[] args) {
    //SuperHero superMan = new SuperHero();
    //SuperHero superHero = new SuperHero("Superboy", 100, false, false, new Weapon(), null, new Flying(), null);
    
    SuperHero superHero = new SuperHeroBuilder("Superman", 150)
      .build();
    
    SuperHero villan = new SuperHeroBuilder("Joker", 100)
      .isVillan()
      .isWounded()
      .withRightWeapon(new Weapon())
      .build();
  }
}
