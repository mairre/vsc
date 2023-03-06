package MVC_GrafikEditor_U2_Vorlage.view;

import java.awt.*;
import javax.swing.*;
import MVC_GrafikEditor_U2_Vorlage.model.*;

public class Drawing extends JComponent {
	private Figure root;
	
	public Drawing(Figure r) {
		root = r;
	}

	@Override
	protected void paintComponent(Graphics gc) {
		super.paintComponent(gc);
		
		//clear (mit fillRect)
		
		//draw a grid (mit drawLine / Color.GRAY)

		//draw figures with a thicker stroke (Stiftstärke)
		Stroke original =((Graphics2D)gc).getStroke(); 
		((Graphics2D)gc).setStroke(new BasicStroke(2));

		//TODO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		root.paint(gc);
		
		((Graphics2D)gc).setStroke(original);
	}

	
	

}
