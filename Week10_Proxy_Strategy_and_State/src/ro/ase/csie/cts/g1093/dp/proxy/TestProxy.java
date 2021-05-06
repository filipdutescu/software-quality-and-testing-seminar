package ro.ase.csie.cts.g1093.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		ILoginService loginService = new LoginService("127.0.0.1", "Server=localhost;Database=game;");
		if (loginService.CanConnectToServer() && loginService.Login("admin", "123")) {
			System.out.println("Hello, admin!");
		}
		else if (loginService.CanConnectToServer()) {
			System.out.println("Invalid credentials.");
		}
		else {
			System.out.println("Cannot connect to the server.");
		}

		loginService = new LoginService2FAProxy(loginService);
		String[] passwords = new String[] { "1admin", "Admin", "2134", "123" };
		for (String pass : passwords) {
			if (loginService.Login("admin", pass)) {
				System.out.println(String.format("Found password! '%s'.", pass));
				break;
			}
		}
	}

}
