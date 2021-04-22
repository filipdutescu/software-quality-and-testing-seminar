package ro.ase.csie.cts.g1093.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Model3DFlyweight implements I3DModel {
  String _name;
  List<Integer> _points = new ArrayList<>();

  public Model3DFlyweight(String _name) {
    this._name = _name;
  }
  
  @Override
  public void display(ScreenData screenData) {
    System.out.println(String.format("Displaying %s at %d, %d, %d with colour %s.",
          _name,
          screenData.X,
          screenData.Y,
          screenData.Z,
          screenData.Color));
  }
}
