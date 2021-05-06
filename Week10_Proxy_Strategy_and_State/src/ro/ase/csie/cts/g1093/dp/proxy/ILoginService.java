package ro.ase.csie.cts.g1093.dp.proxy;

public interface ILoginService {
	public boolean Login(String username, String password);
	
	public boolean CanConnectToServer();
}
