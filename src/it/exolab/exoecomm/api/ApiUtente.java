package it.exolab.exoecomm.api;

import com.google.gson.Gson;

import it.exolab.exoecomm.model.Utente;

public class ApiUtente extends BaseApi {
	
	public UtenteResponse login(Utente model) {
		
		String json;
		UtenteResponse ret = new UtenteResponse();
		UtenteRequest request = new UtenteRequest();
		request.setData(model);
		try {
			String data = new Gson().toJson(request);
			json = doPost("utente/login",data);
			ret = new Gson().fromJson(json, UtenteResponse.class);
			
			if(!ret.isSuccess()) {
				ret.setErr_code("002");
				ret.setErr("errre scnosciuto");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret.setErr_code("001");
			ret.setErr("errore sconosciuto");
		}
		return ret;
		
		
		
	}
}