package ro.ase.csie.cts.g1093.dp.observer;

public class TestObserver {
	public static void main(String[] args)
	{
		ServerConnectionModule connectionModule = new ServerConnectionModule();
		IConnectionStatus backupModule = new BackupModule();
		IConnectionStatus notificationsModule = new UserNotificationsModule();
		
		connectionModule.DetectConnectionStatusChange(ConnectionStatus.UP);
		
		connectionModule.Register(notificationsModule);
		connectionModule.Register(backupModule);
		connectionModule.DetectConnectionStatusChange(ConnectionStatus.DOWN);
		
		connectionModule.Unregister(backupModule);
		connectionModule.DetectConnectionStatusChange(ConnectionStatus.UP);
	}
}
