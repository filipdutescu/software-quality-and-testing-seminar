package ro.ase.csie.cts.g1093.dp.flyweight;

public class TestFlyweight {
  public static void main(String[] args) {
    ScreenData soldier1 = new ScreenData(100, 100, 0, "red");
    ScreenData soldier2 = new ScreenData(100, 100, 0, "green");
    
    ScreenData building1 = new ScreenData(100, 100, 0, "blue");
    ScreenData building2 = new ScreenData(100, 100, 0, "magenta");

    I3DModel soldierModel = ModelsFactory.getModel(ModelType.SOLDIER);
    soldierModel.display(soldier1);
    soldierModel.display(soldier2);

    ModelsFactory.getModel(ModelType.BUILDING).display(building1);
    ModelsFactory.getModel(ModelType.BUILDING).display(building2);
  }
}
