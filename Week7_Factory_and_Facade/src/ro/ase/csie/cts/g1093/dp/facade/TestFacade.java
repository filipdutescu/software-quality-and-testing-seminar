package ro.ase.csie.cts.g1093.dp.facade;

public class TestFacade {
	public static void main(String[] args) {
		GameServer server = new GameServer();
		server.connect();
		
		Login login = new Login("abc", "cba");
		login.login();
		
		UserProfile userProfile = login.getUserProfile();
		
		System.out.println(userProfile.getProfile());
		

		String profile = UserApiFacade.getUserProfile("player2", "123");
		System.out.println(profile);
	}
}
