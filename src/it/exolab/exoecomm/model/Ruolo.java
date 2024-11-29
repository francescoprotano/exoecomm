package it.exolab.exoecomm.model;

public class Ruolo {
	private Long id;
	private String ruolo;
	public final static int RUOLO_CLIENTE =1;
	public final static int RUOLO_STAFF =2;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public Ruolo(Long id, String ruolo) {
		super();
		this.id = id;
		this.ruolo = ruolo;
	}
	public Ruolo() {
		super();
		
		
	}
	
	public boolean isStaff() {
		return id!=null && id.equals(RUOLO_STAFF);
	}
}
