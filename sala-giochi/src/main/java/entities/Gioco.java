package entities;

public class Gioco {
	private String idGioco;
	private String titolo;
	private int annoPubblicazione;
	private double prezzo;

	public Gioco(String idGioco, String titolo, int annoPubblicazione, double prezzo) {
		this.idGioco = idGioco;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		if (prezzo > 0) {
			this.prezzo = prezzo;
		} else {
			throw new IllegalArgumentException("Il prezzo deve essere positivo");
		}
	}

	public String getIdGioco() {
		return idGioco;
	}

	public void setIdGioco(String idGioco) {
		this.idGioco = idGioco;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo > 0) {
			this.prezzo = prezzo;
		} else {
			throw new IllegalArgumentException("Il prezzo deve essere positivo");
		}
	}

	@Override
	public String toString() {
		return "Gioco [idGioco=" + idGioco + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", prezzo=" + prezzo + "]";
	}
	
	
	
}
