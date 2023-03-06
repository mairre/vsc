package command;

import javax.swing.JMenuItem;

public class SaveFileMenu extends JMenuItem implements Command {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaveFileMenu(String text) {
		super(text);
	}

	public void execute() {
		System.out.println("File gespeichert...");
	}
}
