package it.exolab.exoecomm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.exolab.exoecomm.api.ApiUtente;
import it.exolab.exoecomm.api.UtenteResponse;
import it.exolab.exoecomm.model.Utente;

public class UtenteController {
	private static UtenteController instance = null;
	private UtenteController() {
		 
	}
	
	
	public static UtenteController getInstance() {
		
		if(instance==null) {
			instance = new UtenteController();
		}
		return instance;
		
	}
	
	
	public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			request.getSession().removeAttribute("utente");
			response.sendRedirect("main?action=frontend.login");
			
	}
	
	
  public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		Utente model = new Utente(email,password);
		ApiUtente api = new ApiUtente();
		UtenteResponse apiResponse = api.login(model);
		if(apiResponse.isSuccess()) {
			HttpSession session = request.getSession();
			System.out.println(apiResponse.getData());
			session.setAttribute("utente", apiResponse.getData());
			response.sendRedirect("main?action=utente.home");
			
			
		} else {
			response.sendRedirect("main?action=frontend.login");
		}
		
		
		
		
		
	}
	public void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/utente/home.jsp").include(request, response);
		
		
	}

}
