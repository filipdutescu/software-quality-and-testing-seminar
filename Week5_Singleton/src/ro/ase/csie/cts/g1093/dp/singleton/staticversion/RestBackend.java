package ro.ase.csie.cts.g1093.dp.singleton.staticversion;

public class RestBackend {

  private static RestBackend _instance = null;

  private String _url;
  private String _data;

  private RestBackend() {
    // get data from config files
  }

  static {
    System.out.println("Is executed when the class is loaded by the JVM.");

    _instance = new RestBackend();
    _instance._url = "www.acs.ase.ro/cts";
  }

  public static synchronized RestBackend getInstance() {
    return _instance;
  }

  public void sendGET() {
    System.out.println("Send GET command to " + _url);
  }

}
