package ro.ase.csie.cts.g1093.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractNode {
  String _groupName;
  List<AbstractNode> _nodes;

  public Group(String groupName) {
    _groupName = groupName;
    _nodes = new ArrayList<>();
  }

  @Override
  public void attack(String playerName) {
    for (AbstractNode node : _nodes) {
      node.attack(playerName); 
    }
  }

  @Override
  public void retreat() {
    for (AbstractNode node : _nodes) {
      node.retreat(); 
    }
  }

  @Override
  public void move() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void addNode(AbstractNode node) {
    _nodes.add(node);
  }

  @Override
  public AbstractNode getNode(int index) {
    return _nodes.get(index);
  }

  @Override
  public void deleteNode(AbstractNode node) {
    _nodes.remove(node);
  }

}
