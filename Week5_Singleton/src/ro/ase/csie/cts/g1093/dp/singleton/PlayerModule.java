package ro.ase.cts.g1093.dp.singleton;

import ro.ase.cts.g1093.dp.singleton.RestBackend;

public class PlayerModule {

  public PlayerModule(String url, String data) {
    RestBackend backend = RestBackend.getInstance();
  }

}
