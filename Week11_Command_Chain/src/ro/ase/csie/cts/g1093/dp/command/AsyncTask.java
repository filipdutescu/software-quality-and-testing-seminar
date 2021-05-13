package ro.ase.csie.cts.g1093.dp.command;

public class AsyncTask implements IAsyncTask {

	IGameModule _gameModule;
	String _actionDetails;
	int _priority;
	
	public AsyncTask(
			IGameModule gameModule,
			String actionDetails,
			int priority) {
		_gameModule = gameModule;
		_actionDetails = actionDetails;
		_priority = priority;
	}
	
	@Override
	public void StartTaskAsync() {
		_gameModule.ExecuteOperation(_actionDetails);
	}

}
