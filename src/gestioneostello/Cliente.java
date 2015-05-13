package gestioneostello;

import java.util.Vector;

public class Cliente {
	private String nome;
	private String cognome;
	private String numTelefono;
	private Vector<Prenotazione> prenotazioni;
	
	public Cliente(String nome, String cognome, String numTelefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.numTelefono = numTelefono;
	}

	public void addPrenotazione(Prenotazione prenotazione){
		prenotazioni.addElement(prenotazione);
	}
	
	public Vector<Prenotazione> getPrenotazioni(){
		return this.prenotazioni;
	}
	
	public int getGiorniPrenotati(){
		int gp=0;
		for(int i=0;i<this.prenotazioni.size();i++)
		{
			gp = gp + this.prenotazioni.get(i).getNumeroGiorni();
		}
		return gp;
	}
	
	public double getRicavoTotale(){
		double rt=0;
		for(int i=0;i<this.prenotazioni.size();i++)
		{
			rt = rt + this.prenotazioni.get(i).getRicavo();
		}
		return rt;
		
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNumTelefono() {
		return numTelefono;
	}
	
	

}
