package gestioneostello;

import java.util.Vector;

public class Ostello {
	
private Vector<Stanza> stanze;

	public Ostello() {
		stanze = new Vector<Stanza>();
	}
	
	public void addStanza(Stanza stanza){
		if(stanza == null){
			throw new IllegalArgumentException("stanza can't be null");
		}
		stanze.addElement(stanza);
	}
	

}
