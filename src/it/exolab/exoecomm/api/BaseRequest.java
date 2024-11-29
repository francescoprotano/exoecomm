package it.exolab.exoecomm.api;

import java.io.Serializable;

import it.exolab.exoecomm.model.Utente;

public class BaseRequest<T> implements Serializable {
	
	
	private Utente utente;
	private T data;
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	

}
