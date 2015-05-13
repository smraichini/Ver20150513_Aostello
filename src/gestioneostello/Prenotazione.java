package gestioneostello;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prenotazione {
	 private LocalDateTime arrivo;
	 private LocalDate partenza;
	 private Cliente cliente;
	 private Stanza stanza;
	 private int postiRichiesti;
	
	 
	 public Prenotazione(LocalDateTime arrivo, LocalDate partenza,
			Cliente cliente, Stanza stanza, int postiRichiesti) {
		super();
		this.arrivo = arrivo;
		this.partenza = partenza;
		this.cliente = cliente;
		this.stanza = stanza;
		this.postiRichiesti = postiRichiesti;
	}


	public LocalDateTime getArrivo() {
		return arrivo;
	}


	public LocalDate getPartenza() {
		return partenza;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Stanza getStanza() {
		return stanza;
	}
	
	
	public int getNumeroGiorni(){
		return this.partenza.getDayOfYear()-this.arrivo.getDayOfYear();
	}
	
	public double getRicavo(){
		return this.getNumeroGiorni()*this.stanza.getCostoGiornaliero();
	}
	 
}
