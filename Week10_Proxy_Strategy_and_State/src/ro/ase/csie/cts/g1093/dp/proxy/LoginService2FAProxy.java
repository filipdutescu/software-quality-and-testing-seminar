package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginService2FAProxy implements ILoginService {
	private final ILoginService _loginService;
	
	public LoginService2FAProxy(ILoginService loginService) {
		_loginService = loginService;
	}
	
	@Override
	public boolean Login(String username, String password) {
		if (_loginService.Login(username, password)) {
			System.out.println("Please input the 2FA code: ");
			System.out.println("Validating 2FA code.");
			
			return Check2FACode("123asdaf");
		}
		return false;
	}

	@Override
	public boolean CanConnectToServer() {
		return _loginService.CanConnectToServer();
	}

	public boolean Check2FACode(String code) {
		return code.equals("123asdaf");
	}
}
