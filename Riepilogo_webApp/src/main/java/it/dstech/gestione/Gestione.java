package it.dstech.gestione;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import it.dstech.modelli.Persona;


public class Gestione {
	
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("emf");
	private static EntityManager em = emf.createEntityManager();
	
	
	public void salvaUtente(Persona p) throws IOException {


		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

	}
	
	
	public List<Persona>  stampaUtenti() {
		List<Persona> utenti = em.createQuery("SELECT e FROM Persona e ", Persona.class).getResultList();
		return utenti;
	}
	
	
}
