package it.exolab.exoecomm.api;

import java.util.List;

import com.google.gson.Gson;

import it.exolab.exoecomm.api.model.ProdottoResponse;
import it.exolab.exoecomm.model.Prodotto;

public class ApiProdotto extends BaseApi {
	
	public ProdottoIndexResponse index() {
		
		String json;
		ProdottoIndexResponse ret = new ProdottoIndexResponse();
		try {
			json = doGet("prodotto/index");
			ret = new Gson().fromJson(json, ProdottoIndexResponse.class);
			
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
	
	public ProdottoResponse view(Long id) {
		
		String json;
		ProdottoResponse ret = new ProdottoResponse();
		try {
			json = doGet("prodotto/view/"+id);
			ret = new Gson().fromJson(json, ProdottoResponse.class);
			
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
