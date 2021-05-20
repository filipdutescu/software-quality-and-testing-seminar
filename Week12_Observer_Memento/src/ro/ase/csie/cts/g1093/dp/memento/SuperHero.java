package ro.ase.csie.cts.g1093.dp.memento;

public class SuperHero {
	String _name;
	int _lifePoints;
	String _magic;
	
	public SuperHero(String name, int lifePoints, String magic) {
		_name = name;
		_lifePoints = lifePoints;
		_magic = magic;
	}
	
	public void attack()
	{
		System.out.println("Attacked");
	}
	
	public void heal(int hp)
	{
		_lifePoints += hp;
	}
	
	public void takeDamage(int hp)
	{
		_lifePoints -= hp;
	}
	
	public HeroMemento Save()
	{
		return new HeroMemento(_name, _lifePoints, _magic);
	}
	
	public void Restore(HeroMemento memento)
	{
		_name = memento._name;
		_lifePoints = memento._lifePoints;
		_magic = memento._magic;
	}
}
