package ro.ase.csie.cts.g1093.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ServerConnectionModule {
	List<IConnectionStatus> _modules;
	
	public ServerConnectionModule() {
		_modules = new ArrayList<IConnectionStatus>();
	}
	
	public void Register(IConnectionStatus module)
	{
		_modules.add(module);
	}
	
	public void Unregister(IConnectionStatus module)
	{
		_modules.remove(module);
	}
	
	public void DetectConnectionStatusChange(ConnectionStatus status)
	{
		if (status == ConnectionStatus.UP)
		{
			for (IConnectionStatus module : _modules)
			{
				module.ConnectionUp();
			}
		}
		else
		{
			for (IConnectionStatus module : _modules)
			{
				module.ConnectionDown();
			}
		}
	}
}
