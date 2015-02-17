package com.indeko.alpha.client;

import java.io.Serializable;

public class Verbundprojekt implements Serializable {
	String name;
	
	boolean preaview_bekannt;
	boolean answer_gfa_f_ja;
	boolean answer_gfa_h_ja;
	
	boolean answer_gfa_f_teilnehmer;
	boolean answer_gfa_f_referent;
	boolean answer_gfa_h_teilnehmer;
	boolean answer_gfa_h_referent;
	
	boolean answer_bcc_ja;
	
	boolean answer_bcc_teilnehmer;
	boolean answer_bcc_referent;
	
	boolean answer_aplusa_ja;
	boolean answer_aplusa_teilnehmer;
	boolean answer_aplusa_referent;
	
	String anmerkungen;
	
	public String getAnmerkungen() {
		return anmerkungen;
	}
	public void setAnmerkungen(String anmerkungen) {
		this.anmerkungen = anmerkungen;
	}
	public boolean isAnswer_aplusa_ja() {
		return answer_aplusa_ja;
	}
	public void setAnswer_aplusa_ja(boolean answer_aplusa_ja) {
		this.answer_aplusa_ja = answer_aplusa_ja;
	}
	public boolean isAnswer_aplusa_teilnehmer() {
		return answer_aplusa_teilnehmer;
	}
	public void setAnswer_aplusa_teilnehmer(boolean answer_aplusa_teilnehmer) {
		this.answer_aplusa_teilnehmer = answer_aplusa_teilnehmer;
	}
	public boolean isAnswer_aplusa_referent() {
		return answer_aplusa_referent;
	}
	public void setAnswer_aplusa_referent(boolean answer_aplusa_referent) {
		this.answer_aplusa_referent = answer_aplusa_referent;
	}
	public boolean isAnswer_bcc_teilnehmer() {
		return answer_bcc_teilnehmer;
	}
	public void setAnswer_bcc_teilnehmer(boolean answer_bcc_teilnehmer) {
		this.answer_bcc_teilnehmer = answer_bcc_teilnehmer;
	}
	public boolean isAnswer_bcc_referent() {
		return answer_bcc_referent;
	}
	public void setAnswer_bcc_referent(boolean answer_bcc_referent) {
		this.answer_bcc_referent = answer_bcc_referent;
	}
	public boolean isAnswer_bcc_ja() {
		return answer_bcc_ja;
	}
	public void setAnswer_bcc_ja(boolean answer_bcc_ja) {
		this.answer_bcc_ja = answer_bcc_ja;
	}
	public boolean isAnswer_gfa_f_teilnehmer() {
		return answer_gfa_f_teilnehmer;
	}
	public void setAnswer_gfa_f_teilnehmer(boolean answer_gfa_f_teilnehmer) {
		this.answer_gfa_f_teilnehmer = answer_gfa_f_teilnehmer;
	}
	public boolean isAnswer_gfa_f_referent() {
		return answer_gfa_f_referent;
	}
	public void setAnswer_gfa_f_referent(boolean answer_gfa_f_referent) {
		this.answer_gfa_f_referent = answer_gfa_f_referent;
	}
	public boolean isAnswer_gfa_h_teilnehmer() {
		return answer_gfa_h_teilnehmer;
	}
	public void setAnswer_gfa_h_teilnehmer(boolean answer_gfa_h_teilnehmer) {
		this.answer_gfa_h_teilnehmer = answer_gfa_h_teilnehmer;
	}
	public boolean isAnswer_gfa_h_referent() {
		return answer_gfa_h_referent;
	}
	public void setAnswer_gfa_h_referent(boolean answer_gfa_h_referent) {
		this.answer_gfa_h_referent = answer_gfa_h_referent;
	}
	public boolean isAnswer_gfa_f_ja() {
		return answer_gfa_f_ja;
	}
	public void setAnswer_gfa_f_ja(boolean answer_gfa_f_ja) {
		this.answer_gfa_f_ja = answer_gfa_f_ja;
	}
	public boolean isAnswer_gfa_h_ja() {
		return answer_gfa_h_ja;
	}
	public void setAnswer_gfa_h_ja(boolean answer_gfa_h_ja) {
		this.answer_gfa_h_ja = answer_gfa_h_ja;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPreaview_bekannt() {
		return preaview_bekannt;
	}
	public void setPreaview_bekannt(boolean preaview_bekannt) {
		this.preaview_bekannt = preaview_bekannt;
	}
}
