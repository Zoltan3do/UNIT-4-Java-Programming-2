package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {
	
	private List<Gioco> giochi  = new ArrayList<>();
	
	public Collezione() {}
	
	public void aggiungiGioco(Gioco gioco) {
		if(giochi.stream().anyMatch(g-> g.getIdGioco().equals(gioco.getIdGioco()))) {
			throw new IllegalArgumentException("Esiste già");
		}
		giochi.add(gioco);
	}
	
	public Gioco ricercaPerId(String id) {
		return giochi.stream()
				.filter(g->g.getIdGioco().equals(id))
				.findFirst()
				.orElse(null);
	}
	
	public List<Gioco> ricercaPerPrezzo(double prezzo){
		return giochi.stream().filter(g->g.getPrezzo()<prezzo)
				.collect(Collectors.toList());
	}

}
