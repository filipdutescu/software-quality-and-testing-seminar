package ro.ase.csie.cts.g1093.dp.observer;

public class BackupModule implements IConnectionStatus {

	@Override
	public void ConnectionUp() {
		System.out.println("Display restore point");
	}

	@Override
	public void ConnectionDown() {
		System.out.println("Create restore point");
	}

}
