package com.indeko.alpha.server;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class VerbundprojektServer {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;
	
	@Persistent
	private String name;
	
	@Persistent
	private boolean answer_praeview_ja;
	@Persistent 
	boolean answer_gfa_f_ja;
	
	@Persistent 
	boolean answer_gfa_h_ja;
	@Persistent 
	boolean answer_gfa_f_teilnehmer;
	@Persistent 
	boolean answer_gfa_f_referent;
	@Persistent 
	boolean answer_gfa_h_teilnehmer;
	@Persistent 
	boolean answer_gfa_h_referent;
	
	@Persistent
	boolean answer_bcc_ja;
	@Persistent
	boolean answer_bcc_teilnehmer;
	@Persistent
	boolean answer_bcc_referent;
	
	@Persistent
	boolean answer_aplusa_ja;
	@Persistent
	boolean answer_aplusa_teilnehmer;
	@Persistent
	boolean answer_aplusa_referent;
	@Persistent
	String anmerkungen;
	
	public VerbundprojektServer(String name, boolean answer_praeview_ja, boolean answer_gfa_f_ja, boolean answer_gfa_h_ja,
			boolean answer_gfa_f_teilnehmer, boolean answer_gfa_f_referent, boolean answer_gfa_h_teilnehmer, boolean answer_gfa_h_referent,
			boolean answer_bcc_ja,
			boolean answer_bcc_teilnehmer, boolean answer_bcc_referent,
			boolean answer_aplusa_ja,
			boolean answer_aplusa_teilnehmer, boolean answer_aplusa_referent,
			String anmerkungen) {
		this.name = name;
		this.answer_praeview_ja = answer_praeview_ja;
		this.answer_gfa_f_ja = answer_gfa_f_ja;
		this.answer_gfa_h_ja = answer_gfa_h_ja;
		
		this.answer_gfa_f_teilnehmer = answer_gfa_f_teilnehmer;
		this.answer_gfa_f_referent = answer_gfa_f_referent;
		this.answer_gfa_h_teilnehmer = answer_gfa_h_teilnehmer;
		this.answer_gfa_h_referent = answer_gfa_h_referent;
		
		this.answer_bcc_ja = answer_bcc_ja;
		
		this.answer_bcc_teilnehmer = answer_bcc_teilnehmer;
		this.answer_bcc_referent = answer_bcc_referent;
		
		this.answer_aplusa_ja = answer_aplusa_ja;
		this.answer_aplusa_teilnehmer = answer_aplusa_teilnehmer;
		this.answer_aplusa_referent = answer_aplusa_referent;
		
		this.anmerkungen = anmerkungen;
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
	
}
