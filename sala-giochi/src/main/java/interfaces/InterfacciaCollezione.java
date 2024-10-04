package interfaces;

import java.util.List;

import entities.Gioco;
import entities.GiocoDaTavolo;

public interface InterfacciaCollezione {
	
	void aggiungiGioco(Gioco gioco);
	
	Gioco ricercaPerId(String id);
	
	List<Gioco> ricercaPerPrezzo(double prezzo);
	
	List<GiocoDaTavolo> ricercaPerGiocatori(int numeroG);
	
	void rimuoviGioco(String id);

}
