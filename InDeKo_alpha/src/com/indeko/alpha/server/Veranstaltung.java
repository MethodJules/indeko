package com.indeko.alpha.server;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Veranstaltung {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;
	
	@Persistent
	private String name;
	@Persistent
	private String titel;
	@Persistent
	private String ort;
	@Persistent
	private Date datum;
	@Persistent
	private String weitereInfo;
	
	public Veranstaltung(String name, String titel, String ort, Date datum, String weitereInfo) {
		this.name = name;
		this.titel = titel;
		this.ort = ort;
		this.datum = datum;
		this.weitereInfo = weitereInfo;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public String getWeitereInfo() {
		return weitereInfo;
	}
	public void setWeitereInfo(String weitereInfo) {
		this.weitereInfo = weitereInfo;
	}
}
