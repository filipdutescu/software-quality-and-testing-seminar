package ro.ase.csie.cts.g1093.dp.chain;

public abstract class GenericMessageHandler {
	GenericMessageHandler _next = null;
	
	public abstract void ProcessMessage(Message message);
	
	public void SetNext(GenericMessageHandler next)
	{
		_next = next;
	}
}
