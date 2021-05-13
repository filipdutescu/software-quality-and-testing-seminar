package ro.ase.csie.cts.g1093.dp.command;

public class TestCommand {

	public static void main(String[] args)
	{
		TaskManager taskManager = new TaskManager("Main Manager");
		
		taskManager.AddTask(
				new AsyncTask(new AutoSaveModule(5), "Finishing current level..", 0));
		taskManager.AddTask(
				new AsyncTask(new UpdateModule(), "Version 10.5.1", 0));
		
		System.out.println("Game running...");
		taskManager.DoNextTask();
		System.out.println("Game running...");
		taskManager.DoNextTask();
		System.out.println("Game running...");
	}
	
}
