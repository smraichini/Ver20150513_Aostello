package gestioneostello;

import java.util.Vector;

public class Stanza {
	private String numero;
	private int capienza;
	private double costoGiornaliero;
	private Vector<Prenotazione> prenotazioni;
	
	public Stanza(String numero, int capienza, double costoGiornaliero) {
		this.numero = numero;
		this.capienza = capienza;
		this.costoGiornaliero = costoGiornaliero;
		prenotazioni = new Vector<Prenotazione>();
		
	}
	
	public Vector<Prenotazione> getPrenotazioni(){
		return this.prenotazioni;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

	public void setCostoGiornaliero(double costoGiornaliero) {
		this.costoGiornaliero = costoGiornaliero;
	}

	public int getCapienza() {
		return capienza;
	}

	
}
