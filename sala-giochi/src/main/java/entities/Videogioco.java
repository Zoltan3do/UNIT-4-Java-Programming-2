package entities;


public class Videogioco extends Gioco {
	enum GenereVideogioco {
		AZIONE, AVVENTURA, RPG, SIMULAZIONE, STRATEGIA, SPORTIVO
	}

	private String piattaforma; 
	private int durataDiGioco; 
	private GenereVideogioco genere;

	public Videogioco(String idGioco, String titolo, int annoPubblicazione, double prezzo, String piattaforma, int durataDiGioco, GenereVideogioco genere) {
		super(idGioco, titolo, annoPubblicazione, prezzo);
		this.piattaforma = piattaforma;
		this.durataDiGioco = durataDiGioco;
		this.genere = genere;
	}

	public String getPiattaforma() {
		return piattaforma;
	}

	public void setPiattaforma(String piattaforma) {
		this.piattaforma = piattaforma;
	}

	public int getDurataDiGioco() {
		return durataDiGioco;
	}

	public void setDurataDiGioco(int durataDiGioco) {
		this.durataDiGioco = durataDiGioco;
	}

	public GenereVideogioco getGenere() {
		return genere;
	}

	public void setGenere(GenereVideogioco genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Videogioco [piattaforma=" + piattaforma + ", durataDiGioco=" + durataDiGioco + ", genere=" + genere
				+ "]";
	}
	
	
}
