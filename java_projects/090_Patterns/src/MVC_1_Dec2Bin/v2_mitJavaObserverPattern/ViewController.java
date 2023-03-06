package MVC_1_Dec2Bin.v2_mitJavaObserverPattern;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ViewController extends JFrame implements ActionListener, Observer {
	private Model model;
	
	private JTextField decimalField;
	private JTextField resultField;
	
	public ViewController(Model m) {
		super("Two's complement of a decimal number");
		
		//TODO Registrierung
		model = m;

		setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.add(new JLabel("Number to convert: "));
		decimalField = new JTextField("", 32); //TODO: Darstellug des aktuellen Werts
		panel.add(decimalField);
		add(panel,BorderLayout.NORTH);
		
		JButton umwandelnKnopf = new JButton("Convert!");
		umwandelnKnopf.addActionListener(this);
		add(umwandelnKnopf,BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.add(new JLabel("Two's complement:"));
		resultField = new JTextField(32);
		panel.add(resultField);
		add(panel,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			int num = Integer.parseInt(decimalField.getText());
			//TODO Modell ändern
			
		}
		catch (NumberFormatException ex) {
			resultField.setText("Error: wrong number format!");
		}
	}

	public void update(Observable m, Object info) {
		//TODO Darstellung
	}
}
