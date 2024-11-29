package it.exolab.exoecomm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.exolab.exoecomm.api.ApiProdotto;
import it.exolab.exoecomm.api.ProdottoIndexResponse;
import it.exolab.exoecomm.api.model.ProdottoResponse;
import it.exolab.exoecomm.model.Prodotto;

public class ProdottoController {
	
private static ProdottoController instance = null;
	
	private ProdottoController() {
		 
	}
	
	
	public static ProdottoController getInstance() {
		
		if(instance==null) {
			instance = new ProdottoController();
		}
		return instance;
		
	}
	
	
	
	public void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Prodotto model  = new Prodotto();
		ApiProdotto api = new ApiProdotto();
		Long id =Long.valueOf( request.getParameter("id"));
		ProdottoResponse apiResponse = api.view(id);
		if(apiResponse.isSuccess()) {
			model = apiResponse.getData();
			
		}
		request.setAttribute("model", model);
		request.getRequestDispatcher("/prodotto/view.jsp").include(request, response);
		
		
	}
	
}
