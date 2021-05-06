package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginService implements ILoginService {
	private String _serverIp;
	private String _dbConnectionString;
	
	public LoginService(String serverIp, String dbConnectionString) {
		_serverIp = serverIp;
		_dbConnectionString = dbConnectionString;
	}
	
	@Override
	public boolean Login(String username, String password) {
		System.out.println(
				String.format(
						"Connecting to the database (using connection string '%s').",
						_dbConnectionString));
		
		return username.toLowerCase().equals("admin") && password.equals("123");
	}

	@Override
	public boolean CanConnectToServer() {
		System.out.println(String.format("Server %s is up.", _serverIp));
		return true;
	}

}
