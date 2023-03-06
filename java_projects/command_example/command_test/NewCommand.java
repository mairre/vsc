package command_test;

import command.Command;

public class NewCommand implements Command{
	public void execute()
	{
		System.out.println("Neues File erstellt");
	}
}
