package it.exolab.exoecomm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController {
	
private static MainController instance = null;
	
	private MainController() {
		 
	}
	
	
	public static MainController getInstance() {
		
		if(instance==null) {
			instance = new MainController();
		}
		return instance;
		
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if(action==null) {
			action="frontend.home";
		}
		switch(action) {
			case "prodotto.view":
				ProdottoController.getInstance().view(request, response);
				break;
			
			case "frontend.home":
				FrontController.getInstance().home(request, response);
				break;
			case "utente.home":
				UtenteController.getInstance().home(request, response);
				break;
				
			case "frontend.login":
				FrontController.getInstance().login(request, response);
				break;				
			case "frontend.logout":
				UtenteController.getInstance().logout(request, response);
				break;
		}
		
		
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String action = request.getParameter("action");
		if(action==null) {
			response.sendRedirect("main?action=frontend.home");
			return;
		}
		switch(action) {
			
			case "utente.login":
				UtenteController.getInstance().login(request, response);
				break;				
		}
		
		
		
	}
	
	
	

}
