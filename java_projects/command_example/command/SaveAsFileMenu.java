package command;

import javax.swing.JMenuItem;

public class SaveAsFileMenu extends JMenuItem implements Command {
    /**
    * 
    */
    private static final long serialVersionUID = 1L;

    public SaveAsFileMenu(String text) {
        super(text);
    }

    public void execute() {
        System.out.println("File gespeichert als...");
    }
}
