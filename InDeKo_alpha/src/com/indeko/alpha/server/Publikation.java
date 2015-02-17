package com.indeko.alpha.server;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Publikation {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;
	
	@Persistent
	private String autor;
	@Persistent
	private String jahr;
	@Persistent
	private String titel;
	@Persistent
	private String ort;
	
	
	public Publikation(String autor,String jahr, String titel, String ort ) {
		this.autor = autor;
		this.jahr = jahr;
		this.titel = titel;
		this.ort = ort;
	}
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getJahr() {
		return jahr;
	}
	public void setJahr(String jahr) {
		this.jahr = jahr;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
}
