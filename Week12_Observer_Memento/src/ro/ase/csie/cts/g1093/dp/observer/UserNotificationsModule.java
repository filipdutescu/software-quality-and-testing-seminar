package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationsModule implements IConnectionStatus {

	@Override
	public void ConnectionUp() {
		System.out.println("PopUp: Connection is active");		
	}

	@Override
	public void ConnectionDown() {
		System.out.println("PopUp: Connection to server is lost");
	}

}
