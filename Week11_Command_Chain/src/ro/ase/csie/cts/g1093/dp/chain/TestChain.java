package ro.ase.csie.cts.g1093.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		GenericMessageHandler filterModule = new FilterModule("English");
		GenericMessageHandler privateModule = new PrivateMessageModule();
		GenericMessageHandler groupModule = new GroupMessageModule();
		
		filterModule.SetNext(groupModule);
		groupModule.SetNext(privateModule);
		
		GenericMessageHandler chatServer = filterModule;
		
		chatServer.ProcessMessage(new Message("Hello John", "@John", 1));
		chatServer.ProcessMessage(new Message("I hate you", "@John", 1));
		chatServer.ProcessMessage(new Message("Let's join the party", "@everyone", 1));
	}

}
