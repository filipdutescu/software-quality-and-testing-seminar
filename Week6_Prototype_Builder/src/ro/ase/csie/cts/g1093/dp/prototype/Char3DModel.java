package ro.ase.csie.cts.g1093.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Char3DModel implements Cloneable {

  CharacterType _type;
  String _colour;

  ArrayList<Integer> _graphicsPoints;

  public Char3DModel(CharacterType type, String colour) {
    _type = type;
    _colour = colour;
    _graphicsPoints = new ArrayList<>();

    System.out.println("Generating 3D points...");
    try {
      Random rnd = new Random(7887);

      Thread.sleep(2000);
      for(int i = 0; i < 20; ++i) {
        _graphicsPoints.add(rnd.nextInt(1000));
      }
      System.out.println("Model loaded.");
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    Char3DModel copy = new Char3DModel();

    copy._type = _type;
    copy._colour = _colour;
    copy._graphicsPoints = (ArrayList<Integer>)_graphicsPoints.clone();

    return copy;
  }

  private Char3DModel() {
  }

}
