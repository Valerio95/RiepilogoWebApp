package it.dstech.gestione;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.modelli.Persona;

@WebServlet(urlPatterns = "/Accesso")
public class StampaInserisciDati extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Pagina non accessibile");
		req.getRequestDispatcher("/Homepage.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String scelta = req.getParameter("scelta");
		Gestione gestione = new Gestione();
		
		if(scelta.equalsIgnoreCase("Accedi al database")) {
			req.setAttribute("listaUtenti", gestione.stampaUtenti());

			req.getRequestDispatcher("InserisciDati.jsp").forward(req, resp);

		}else if(scelta.equalsIgnoreCase("torna indietro")) {
			req.getRequestDispatcher("Homepage.jsp").forward(req, resp);

		}
		else if (scelta.equalsIgnoreCase("inserisci")){
			
			String nome = req.getParameter("nome");
			String cognome = req.getParameter("cognome");
			int codice = Integer.parseInt(req.getParameter("codice"));
			Persona p= new Persona();
			p.setCodice(codice);
			p.setCognome(cognome);
			p.setNome(nome);
			gestione.salvaUtente(p);
			req.setAttribute("listaUtenti", gestione.stampaUtenti());		
		req.getRequestDispatcher("InserisciDati.jsp").forward(req, resp);
		}

		
	}

}
