package MVC_1_Dec2Bin.v1_mitEigenerObserverPatternImplementation;

import java.util.*;

//TODO Registrierung und Benachrichtigung (Halten Sie sich an das Muster!)

public class Model {
	//Datenstrutkur zur Registrierung
	private ArrayList<ViewController> observers;
	
	//und nun die eigenen Datenfelder
	private int number;
	
	//Konstruktor
	public Model() {
		observers = new ArrayList<>();
		number = 0;
	}

	
	//Zugriff auf die eigene Datenstruktur
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
		notifyAllObservers();
	}
	

	//Infrastruktur Observer-Pattern
	public void attach(ViewController c) {
		observers.add(c);
	}
	
	public void notifyAllObservers() {
		for (ViewController c : observers) {
			c.update();
		}
	}



}
