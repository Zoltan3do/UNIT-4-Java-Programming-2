package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import interfaces.InterfacciaCollezione;

public class Collezione implements InterfacciaCollezione {
	
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
	
	@Override
	public void rimuoviGioco(String id) {
		Gioco gioco = ricercaPerId(id);
		giochi.remove(gioco);
	}
	
	

	public List<GiocoDaTavolo> ricercaPerGiocatori(int numeroG){
		return giochi.stream()
				.filter(g-> g instanceof GiocoDaTavolo)
				.map(g -> (GiocoDaTavolo) g)
				.filter(gdt -> gdt.getNumeroGiocatori() == numeroG)
				.collect(Collectors.toList());	
	}
	
	 
	public void stampaLista() {
		for(Gioco g:giochi) {
			System.out.println(g.toString());
		}
	}



}
