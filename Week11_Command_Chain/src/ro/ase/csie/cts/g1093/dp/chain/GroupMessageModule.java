package ro.ase.csie.cts.g1093.dp.chain;

public class GroupMessageModule extends GenericMessageHandler {

	@Override
	public void ProcessMessage(Message message) {
		if (message._destination.toLowerCase().equals("@everyone"))
		{
			System.out.println("Group message: " + message._text);
		}
		
		if (_next != null)
		{
			_next.ProcessMessage(message);
		}
	}

}
