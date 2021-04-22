package ro.ase.csie.cts.g1093.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ModelsFactory {
  private static Map<String, I3DModel> _models = new HashMap<>();

  static {
    _models.put(ModelType.BUILDING.toString(), new Model3DFlyweight("Building"));
    _models.put(ModelType.SOLDIER.toString(), new Model3DFlyweight("Soldier"));
  }

  public static I3DModel getModel(ModelType type) {
    return _models.get(type.toString());
  }
}
