package command_test;

import command.Command;

public class OpenCommand implements Command{
	public void execute()
	{
		System.out.println("Öffne neus File");
	}
}
