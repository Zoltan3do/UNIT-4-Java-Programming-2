package entities;

public class GiocoDaTavolo extends Gioco {
	private int numeroGiocatori; 
	private int durataMediaPartita; 

	public GiocoDaTavolo(String idGioco, String titolo, int annoPubblicazione, double prezzo, int numeroGiocatori, int durataMediaPartita) {
		super(idGioco, titolo, annoPubblicazione, prezzo);
		if (numeroGiocatori >= 2 && numeroGiocatori <= 10) {
			this.numeroGiocatori = numeroGiocatori;
		} else {
			throw new IllegalArgumentException("Il numero di giocatori deve essere compreso tra 2 e 10");
		}
		this.durataMediaPartita = durataMediaPartita;
	}

	public int getNumeroGiocatori() {
		return numeroGiocatori;
	}

	public void setNumeroGiocatori(int numeroGiocatori) {
		if (numeroGiocatori >= 2 && numeroGiocatori <= 10) {
			this.numeroGiocatori = numeroGiocatori;
		} else {
			throw new IllegalArgumentException("Il numero di giocatori deve essere compreso tra 2 e 10");
		}
	}

	public int getDurataMediaPartita() {
		return durataMediaPartita;
	}

	public void setDurataMediaPartita(int durataMediaPartita) {
		this.durataMediaPartita = durataMediaPartita;
	}

	@Override
	public String toString() {
		return "GiocoDaTavolo [numeroGiocatori=" + numeroGiocatori + ", durataMediaPartita=" + durataMediaPartita + "]";
	}
	
	
}
