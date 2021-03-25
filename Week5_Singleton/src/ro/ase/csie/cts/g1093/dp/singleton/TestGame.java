package ro.ase.cts.g1093.dp.singleton;

import ro.ase.cts.g1093.dp.singleton.RestBackend;
import ro.ase.cts.g1093.dp.singleton.UiModule;

public class TestGame {

  public static void main(String[] args) {
    RestBackend backend = RestBackend.getInstance();

    backend.sendGET();

    UiModule uiModule = new UiModule();

  }

}
