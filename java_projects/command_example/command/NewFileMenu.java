package command;

import javax.swing.JMenuItem;

public class NewFileMenu extends JMenuItem implements Command{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewFileMenu(String text)
	{
		super(text);
	}
	
	public void execute()
	{
		System.out.println("File erstellt...");
	}
}
