package manu_barone.sala_giochi;

import java.util.List;
import java.util.Scanner;

import entities.Collezione;
import entities.GenereVideogioco;
import entities.Gioco;
import entities.GiocoDaTavolo;
import entities.Videogioco;

public class Application {

	public static void main(String[] args) {
		Collezione collezione = new Collezione();
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.println("Scegli cosa fare:\n"
					+ "1)Aggiungi un gioco\n"
					+ "2)Ricerca per id\n"
					+ "3)Ricerca per prezzo\n"
					+ "4)Ricerca per numero giocatori\n"
					+ "5)Rimuovi gioco\n"
					+ "6)Stampa giochi\n"
					+ ""
					+ "0)Esci");

			int ris = Integer.parseInt(in.nextLine());

			switch(ris) {
			
			case 1:
				try {
					System.out.println("Inserisci l'id");
					String id = in.nextLine();
					System.out.println("INserisci il titolo");
					String titolo = in.nextLine();
					System.out.println("Inserisci l'anno di pubblicazione");
					int anno = Integer.parseInt(in.nextLine());
					System.out.println("Inserisci prezzo");
					double prezzo = Double.parseDouble(in.nextLine());

					System.out.println("Inserisci 1 se è un videogioco e 2 se è un gioco da tavolo");
					int tipo = Integer.parseInt(in.nextLine());

					if(tipo == 1) {
						System.out.println("Inserisci piattaforma:");
						String piattaforma = in.nextLine();
						System.out.println("INserisci durata del gioco in ore");
						int durata = Integer.parseInt(in.nextLine());
						System.out.println("Inserisci genere (AZIONE, AVVENTURA ..");
						String genere = in.nextLine();

						Videogioco vg = new Videogioco(id,
								titolo,
								anno,
								prezzo,
								piattaforma,
								durata,
								GenereVideogioco.valueOf(genere.toUpperCase()));

						collezione.aggiungiGioco(vg);
					}else if(tipo == 2) {
						System.out.println("Inserisci numero di giocatori ");
						int nGiocatori = Integer.parseInt(in.nextLine());
						System.out.println("Inserisci durata media partita in minuti ");
						int durataP = Integer.parseInt(in.nextLine());
						GiocoDaTavolo gdt = new GiocoDaTavolo(id,titolo,anno,prezzo,nGiocatori,durataP);  

						collezione.aggiungiGioco(gdt);}

				}catch(Exception e) {
					System.out.println("Errore " + e.getMessage());
				}
				break;

			case 2:
				try {
					System.out.println("Inserisci l'id del gioco che vuoi trovare");
					String id = in.nextLine();
					Gioco giocoTrovato = collezione.ricercaPerId(id);
					System.out.println("Il gioco è " + giocoTrovato.getTitolo());

				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				System.out.println("Inserisci prezzo da filtrare");
				double pr = Double.parseDouble(in.nextLine());
				List<Gioco> giochiTrovati = collezione.ricercaPerPrezzo(pr);
				giochiTrovati.forEach(g -> System.out.println(g.getTitolo()));
				break;
				
			case 4:
				System.out.println("Inserisci numero di giocatori ");
				int num = Integer.parseInt(in.nextLine());
				List<GiocoDaTavolo> giochiDaTavoloTrovati = collezione.ricercaPerGiocatori(num);
				giochiDaTavoloTrovati.forEach(g-> System.out.println(g.getTitolo()));
				break;
				
			case 5:
				try {
					System.out.println("Inserisci id");
					String id = in.nextLine();
					collezione.rimuoviGioco(id);
					System.out.println("Gioco rimovidossss");
				}catch(Exception  e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6:
				collezione.stampaLista();
				break;

			}
		}
	}
}
