package manu_barone.Jpa_Crud;

import java.time.LocalDate;

import dao.EventDao;
import entities.Evento;
import entities.TIpoEvento;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDao sd = new EventDao(em);
        
        LocalDate ld = LocalDate.now();
        Evento rave = new Evento("Rave",ld,"rave party",TIpoEvento.PUBBLICO,9000);
        sd.save(rave);
        
        try {
        	Evento fromDb = sd.findById(1);
        	System.out.println(fromDb);
        	sd.findByIdAndDelete(1);
        }catch(NotFoundException e) {
        	System.out.println(e.getMessage());
        }
        
        em.close();
        emf.close();
    }
}
