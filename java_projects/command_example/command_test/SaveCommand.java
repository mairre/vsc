package command_test;

import command.Command;

public class SaveCommand implements Command{
	public void execute()
	{
		System.out.println("File gespeichert...");
	}
}
