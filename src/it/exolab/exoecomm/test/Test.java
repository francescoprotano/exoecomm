package it.exolab.exoecomm.test;

import it.exolab.exoecomm.api.ApiUtente;
import it.exolab.exoecomm.api.UtenteResponse;
import it.exolab.exoecomm.model.Utente;

public class Test {

	public static void main(String[] args) {
		Utente model = new Utente();
		model.setEmail("admin@localhost");
		model.setPassword("demo");
		ApiUtente api = new ApiUtente();
		UtenteResponse response = api.login(model);
		
		if(response.isSuccess()) {
			model = response.getData();
			System.out.println("ok");
			System.out.println(model.getId());
		}

	}

}
