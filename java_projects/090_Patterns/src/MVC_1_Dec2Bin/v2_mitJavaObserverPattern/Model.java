package MVC_1_Dec2Bin.v2_mitJavaObserverPattern;

import java.util.Observable;

public class Model extends Observable {
	
	//und nun die eigenen Datenfelder
	private int number;
	
	//Konstruktor
	public Model() {
		number = 0;
	}

	
	//Zugriff auf die eigene Datenstruktur
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
		//notifizierung
		setChanged();
		notifyObservers();
	}
	
}
