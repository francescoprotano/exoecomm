package it.exolab.exoecomm.model;

public class Prodotto {
	
	private Long id;
	private String nome;
	private Float prezzo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	public Prodotto(Long id, String nome, Float prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	public Prodotto() {
		super();
		
	}
	
	public Prodotto(String nome, Float prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
	}
	

}
