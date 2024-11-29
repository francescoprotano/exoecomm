package it.exolab.exoecomm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.exolab.exoecomm.api.ApiProdotto;
import it.exolab.exoecomm.api.ProdottoIndexResponse;
import it.exolab.exoecomm.model.Prodotto;

public class FrontController {
	
	private static FrontController instance = null;
	private FrontController() {
		 
	}
	
	
	public static FrontController getInstance() {
		
		if(instance==null) {
			instance = new FrontController();
		}
		return instance;
		
	}
	
	public void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Prodotto> model  = new ArrayList<Prodotto>();
		ApiProdotto api = new ApiProdotto();
		ProdottoIndexResponse apiResponse = api.index();
		if(apiResponse.isSuccess()) {
			model = apiResponse.getData();
			
		}
		request.setAttribute("model", model);
		request.getRequestDispatcher("/frontend/home.jsp").include(request, response);
		
		
	}
	
	
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/frontend/login.jsp").include(request, response);
		
		
	}
	
	
}
