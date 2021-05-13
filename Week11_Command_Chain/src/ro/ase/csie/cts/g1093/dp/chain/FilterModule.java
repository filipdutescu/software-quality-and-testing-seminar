package ro.ase.csie.cts.g1093.dp.chain;

public class FilterModule extends GenericMessageHandler {

	String _language;
	String[] _dictionary = new String[] { "hate", "kill", "violent" };
	
	public FilterModule(String language) {
		super();
		_language = language;
	}
	
	@Override
	public void ProcessMessage(Message message) {
		boolean isFiltered = true;
		
		for (String word : _dictionary)
		{
			if (message._text.toLowerCase().contains(word))
			{
				isFiltered = false;
				break;
			}
		}
		
		if (isFiltered)
		{
			if (_next != null)
			{
				_next.ProcessMessage(message);	
			}
		}
	}

}
