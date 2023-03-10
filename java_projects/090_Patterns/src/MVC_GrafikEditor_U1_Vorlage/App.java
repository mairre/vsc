package MVC_GrafikEditor_U1_Vorlage;

import java.awt.Color;
import javax.swing.*;

public class App {

	public static void main(String[] args) {
		//		Gruppe x:0, y:0
		//			Kreis x:10, y:30, r: 40
		//			Rechteck x:45, y:90, w: 40 h: 60
		//			Gruppe x: 100, y: 200
		//				Kreis x:0, y:0, r: 100
		//				Rechteck x:175, y:85, w: 50 h: 50
		Group root = new Group(0, 0);
		root.add(new Circle(10, 30, Color.BLACK, 40));
		root.add(new Rectangle(45, 90, Color.RED, 40, 60));
		
		Group g2 = new Group(100, 200);
		g2.add(new Circle(0, 0, Color.GREEN, 100));
		g2.add(new Rectangle(175, 85, Color.BLUE, 50, 50));

		root.add(g2);
		
		//und nun ein Test. (U1)
		System.out.println(root);
		
		//und nun zwei Viewer (U2)
		//JFrame v1 = new DrawingViewer(root);
		//JFrame v2 = new DrawingViewer(root); v2.setLocation(800, 0);
		
		//und ein JTree-Viewer (U3)
		//JFrame v3 = new TreeViewer(root);

		//und ein JTree/JTable-Viewer (U4)
		//JFrame v4 = new TreeViewerExtended(root);
		
	}

}
