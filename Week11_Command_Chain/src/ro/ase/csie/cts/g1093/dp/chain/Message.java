package ro.ase.csie.cts.g1093.dp.chain;

public class Message {
	String _text;
	String _destination;
	int _priority;
	
	public Message(String text, String destination, int priority) {
		_text = text;
		_destination = destination;
		_priority = priority;
	}
}
