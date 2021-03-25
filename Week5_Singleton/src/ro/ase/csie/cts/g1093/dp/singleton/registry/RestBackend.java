package ro.ase.csie.cts.g1093.dp.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class RestBackend {

  String _url;
  String _data;

  private static Map<String, RestBackend> _registry = new HashMap<>();

  private RestBackend(String url, String data) {
    _url = url;
    _data = data;
  }

  public static synchronized RestBackend getInstance(String url, String data) {
    RestBackend instance = _registry.get(url);

    if (instance == null) {
      instance = new RestBackend(url, data);
      _registry.put(url, instance);
    }

    return instance;
  }

}
