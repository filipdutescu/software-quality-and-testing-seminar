package ro.ase.csie.cts.g1093.dp.composite;

public class TestComposite {
  public static void main(String[] args) {
    AbstractNode g1 = new Group("Red team");
    g1.addNode(new Npc("Soldier 1", 100));
    g1.addNode(new Npc("Soldier 2", 70));

    AbstractNode g2 = new Group("Blue team");
    g2.addNode(new Npc("Soldier 3", 150));
    g2.addNode(new Npc("Soldier 4", 125));
    g2.addNode(new Npc("Tank 1", 450));

    AbstractNode levelGroup = new Group("Level 2");
    levelGroup.addNode(new Npc("Level boss", 1500));
    levelGroup.addNode(g1);
    levelGroup.addNode(g2);

    levelGroup.attack("Superman");
    levelGroup.retreat();
    levelGroup.getNode(0).move();
  }
}
