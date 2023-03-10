package MVC_GrafikEditor_U2_Vorlage.model;

import java.awt.Color;
import java.awt.Graphics;

public class Figure {
	protected int x, y;
	protected Color color;
	protected Figure parent;
	
	public Figure(int x, int y, Color c) {
		setX(x);
		setY(y);
		setColor(c);
		parent = null;
	}

	public int getX() {
		return x;
	}
	
	public int getAbsX() {
		return parent != null ? parent.getAbsX() + getX() : getX();
	}
		
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public int getAbsY() {
		return parent != null ? parent.getAbsY() + getY() : getY();
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getBoundingBoxWidth() {
		return 0;
	}
	
	public int getBoundingBoxHeight() {
		return 0;
	}
	
	public String toString() {
		return toString(0);
	}
	
	public String toString(int level) {
		String s = ""; for (int i = 0; i < level; i++) { s += "  "; }
		return s + this.getClass().getName() 
				+ " (" + x + ", " + y + ", " 
				+ this.getBoundingBoxWidth() + ", " + this.getBoundingBoxHeight() + ") "
				+ this.color.toString()
				+ " <" + getAbsX() + ", " + getAbsY() + "> " 
				;
	}

	public void paint(Graphics gc) {
		//nothing to do
	}
}
