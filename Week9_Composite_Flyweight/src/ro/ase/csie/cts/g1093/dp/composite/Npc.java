package ro.ase.csie.cts.g1093.dp.composite;

public class Npc extends AbstractNode {

  String _name;
  int _powerLevel;

  public Npc(String name, int powerLevel) {
    _name = name;
    _powerLevel = powerLevel;
  }

	@Override
	public void attack(String playerName) {
    System.out.println(String.format("%s attacks player %s.", _name, playerName));
	}

	@Override
	public void retreat() {
    System.out.println(String.format("%s is retreating.", _name));
	}

	@Override
	public void move() {
    System.out.println(String.format("%s is moving.", _name));
	}

	@Override
	public void addNode(AbstractNode node) {
    throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode getNode(int index) {
    throw new UnsupportedOperationException();
	}

	@Override
	public void deleteNode(AbstractNode node) {
    throw new UnsupportedOperationException();
	}
}
