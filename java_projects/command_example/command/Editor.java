package command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Editor extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Editor();
	}

	Editor() {
		// Create Main Window
		JFrame mainFrame = new JFrame("Text Editor");

		// Create Menu Bar
		JMenuBar menuBar = new JMenuBar();

		// Create File Menu
		JMenu fileMenu = new JMenu("File");

		// Create Menu items
		NewFileMenu m_file1 = new NewFileMenu("New");
		JMenuItem m_file2 = new OpenFileMenu("Open");
		JMenuItem m_file3 = new SaveFileMenu("Save");
		JMenuItem m_file4 = new SaveAsFileMenu("SaveAs");

		// Add action listener
		m_file1.addActionListener(this);
		m_file2.addActionListener(this);
		m_file3.addActionListener(this);
		m_file4.addActionListener(this);

		// Add Sub Menu to Menu File
		fileMenu.add(m_file1);
		fileMenu.add(m_file2);
		fileMenu.add(m_file3);
		fileMenu.add(m_file4);

		// Add File Menu to Menu Bar
		menuBar.add(fileMenu);

		// Create Textfield
		JTextArea text = new JTextArea(5, 20);

		// Add Menu Bar and Textfield to Mainframe
		mainFrame.setJMenuBar(menuBar);
		mainFrame.add(text);

		// Set Mainframe Properties
		mainFrame.setSize(500, 800);
		mainFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// command = (Command)e.getActionCommand()
		Command command = (Command) e.getSource();
		command.execute();
	}
}
