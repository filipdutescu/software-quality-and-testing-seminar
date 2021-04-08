package ro.ase.csie.cts.g1093.dp.facade;

public class Login {
	String _username;
	String _password;
	
	public Login(String username, String password) {
		super();
		_username = username;
		_password = password;
	}
	
	public void login() {
		
	}
	
	public UserProfile getUserProfile() {
		return new UserProfile();
	}
}
