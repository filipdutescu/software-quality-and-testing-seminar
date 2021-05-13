package ro.ase.csie.cts.g1093.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	List<IAsyncTask> _tasks = new ArrayList<IAsyncTask>();
	String _name;
	
	public TaskManager(String name) {
		_name = name;
	}
	
	public void AddTask(IAsyncTask task)
	{
		_tasks.add(task);
	}
	
	public void DoNextTask()
	{
		//determine priority...
		//...
		
		if (!_tasks.isEmpty())
		{
			IAsyncTask task = _tasks.get(0);
			task.StartTaskAsync();
			_tasks.remove(0);
		}
	}
}
