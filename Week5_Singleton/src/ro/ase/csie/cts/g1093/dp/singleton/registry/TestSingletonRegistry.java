package ro.ase.csie.cts.g1093.dp.singleton.registry;

public class TestSingletonRegistry {

  public static void main(String[] args) {
    RestBackend b1 = RestBackend.getInstance("www.acs.ase.ro/cts", "test");
    RestBackend b2 = RestBackend.getInstance("www.acs.ase.ro/cts", "test 2");


    if(b1 == b2) {
      System.out.println("Same object");
    }
    else {
      System.out.println("Different objects");
    }

    RestBackend b3 = RestBackend.getInstance("localhost", "test");

    if(b1 == b3) {
      System.out.println("Same object");
    }
    else {
      System.out.println("Different objects");
    }
  }

}
