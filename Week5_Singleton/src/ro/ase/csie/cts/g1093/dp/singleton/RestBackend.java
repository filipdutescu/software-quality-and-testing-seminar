package ro.ase.csie.cts.g1093.dp.singleton;

public class RestBackend {

  private static RestBackend _instance = null;

  private String _url;
  private String _data;

  private RestBackend(String url, String data) {
    System.out.println("Openning  a connection to the backend service...");
    _url = url;
    _data = data;
  }

  private RestBackend() {
  }

  public static synchronized RestBackend getInstance() {
    if (_instance == null) {
      _instance = new RestBackend("www.acs.ase.ro/cts", "Get backend connection");
    }

    return _instance;
  }

  public static synchronized RestBackend getInstance(String url, String data) {
    if (_instance == null) {
      _instance = new RestBackend(url, data);
    }

    return _instance;
  }

  public void sendGET() {
    System.out.println("Send GET command to " + _url);
  }

}
