package ro.ase.csie.cts.g1093.dp.facade;

public class UserApiFacade {
	public static String getUserProfile(String user, String password) {
		GameServer server = new GameServer();
		server.connect();
		
		Login login = new Login("abc", "cba");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		
		return userProfile.getProfile();
	}
}
