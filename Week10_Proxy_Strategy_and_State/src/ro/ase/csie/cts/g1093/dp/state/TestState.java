package ro.ase.csie.cts.g1093.dp.state;

public class TestState {

	public static void main(String[] args) {
		SuperHero superHero = new SuperHero("Superman", 500.0F);
		
		superHero.Move();
		
		superHero.TakeHit(350.0F);
		superHero.Move();
		
		superHero.TakeHit(130.0F);
		superHero.Move();
		
		superHero.Heal(480.0F);
		superHero.Move();
	}

}
