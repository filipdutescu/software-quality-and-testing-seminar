package ro.ase.csie.cts.g1093.dp.command;

public class UpdateModule implements IGameModule {

	@Override
	public void ExecuteOperation(String details) {
		System.out.println("Update: " + details);
	}

}
