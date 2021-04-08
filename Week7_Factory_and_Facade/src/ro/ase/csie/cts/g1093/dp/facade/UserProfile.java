package ro.ase.csie.cts.g1093.dp.facade;

public class UserProfile {
	String _username;
	String _email;
	
	public String getProfile() {
		return String.format(
				"Username: %s; Email: %s.", 
				_username, 
				_username);
	}
}
