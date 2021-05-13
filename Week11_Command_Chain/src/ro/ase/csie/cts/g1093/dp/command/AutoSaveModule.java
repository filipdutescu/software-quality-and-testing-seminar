package ro.ase.csie.cts.g1093.dp.command;

public class AutoSaveModule implements IGameModule {

	int _frequency;
	
	public AutoSaveModule(int frequency) {
		_frequency = frequency;
	}
	
	@Override
	public void ExecuteOperation(String details) {
		System.out.println("Autosaving for " + details);
	}

}
