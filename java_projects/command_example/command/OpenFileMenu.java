package command;

import javax.swing.JMenuItem;

public class OpenFileMenu extends JMenuItem implements Command {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OpenFileMenu(String text) {
		super(text);
	}

	public void execute() {
		System.out.println("File geöffnet...");
	}
}
