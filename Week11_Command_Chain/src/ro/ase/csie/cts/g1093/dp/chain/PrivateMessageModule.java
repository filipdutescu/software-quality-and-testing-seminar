package ro.ase.csie.cts.g1093.dp.chain;

public class PrivateMessageModule extends GenericMessageHandler {

	@Override
	public void ProcessMessage(Message message) {
		if (!message._destination.toLowerCase().equals("@everyone"))
		{
			System.out.println("Private message for " + message._destination + ": " + message._text);
		}
		else
		{
			if (_next != null)
			{
				_next.ProcessMessage(message);
			}
		}
	}

}
