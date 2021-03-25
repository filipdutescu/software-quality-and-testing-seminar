package ro.ase.csie.cts.g1093.dp.singleton;

public class TestGame {

  public static void main(String[] args) {
    RestBackend backend = RestBackend.getInstance();

    backend.sendGET();

    UiModule uiModule = new UiModule();
    PlayerModule playerModule = new PlayerModule();

    // Bad code, gives impression of multiple singletons
    // RestBackend backend2 = RestBackend.getInstance("test", "test");
  }

}
