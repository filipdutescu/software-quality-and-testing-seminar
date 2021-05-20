package ro.ase.csie.cts.g1093.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		SuperHero superman = new SuperHero("Superman", 100, "Fly");
		HeroMemento initialSave = superman.Save();
		
		superman.takeDamage(25);
		superman.takeDamage(40);
		
		System.out.println("Lifepoints: " + superman._lifePoints);
		
		superman.Restore(initialSave);
		System.out.println("Lifepoints: " + superman._lifePoints);
	}

}
