package com.indeko.alpha.server;

import java.util.Date;
import java.util.logging.Logger;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;






import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.indeko.alpha.client.SaveDataService;
import com.indeko.alpha.client.Verbundprojekt;

public class SaveDataServiceImpl extends RemoteServiceServlet implements SaveDataService {
	private static final Logger LOG = Logger.getLogger(SaveDataServiceImpl.class.getName());
	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");
	
	public void saveData(String data) {
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.makePersistent(new Data("Hallo"));
		} finally {
			pm.close();
		}
	}
	
	
	public void addVeranstaltung(String name, String titel, String ort, Date datum, String weitereInfo) {
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.makePersistent(new Veranstaltung(name,titel,ort,datum,weitereInfo));
		} finally {
			pm.close();
		}
	}
	
	
	public void addPublication(String autor, String jahr, String titel, String ort) {
		PersistenceManager pm = getPersistenceManager();
		try{
			pm.makePersistent(new Publikation(autor, jahr, titel, ort));
		} finally {
			pm.close();
		}
	}
	
	public void addZeitschrift(String titel) {
		PersistenceManager pm = getPersistenceManager();
		try{
			pm.makePersistent(new Zeitschrift(titel));
		} finally {
			pm.close();
		}
	}
	
	public void addVerbundprojekt(Verbundprojekt verbundprojekt) {
		String name = verbundprojekt.getName();
		boolean answer_praeview_ja = verbundprojekt.isPreaview_bekannt();
		boolean answer_gfa_f_ja = verbundprojekt.isAnswer_gfa_f_ja();
		boolean answer_gfa_h_ja = verbundprojekt.isAnswer_gfa_h_ja();
		
		boolean answer_gfa_f_teilnehmer = verbundprojekt.isAnswer_gfa_f_teilnehmer();
		boolean answer_gfa_f_referent = verbundprojekt.isAnswer_gfa_f_referent();
		boolean answer_gfa_h_teilnehmer = verbundprojekt.isAnswer_gfa_h_teilnehmer();
		boolean answer_gfa_h_referent = verbundprojekt.isAnswer_gfa_h_referent();
		
		boolean answer_bcc_ja = verbundprojekt.isAnswer_bcc_ja();
		
		boolean answer_bcc_teilnehmer = verbundprojekt.isAnswer_bcc_teilnehmer();
		boolean answer_bcc_referent = verbundprojekt.isAnswer_bcc_referent();
		
		boolean answer_aplusa_ja = verbundprojekt.isAnswer_aplusa_ja();
		
		boolean answer_aplusa_teilnehmer = verbundprojekt.isAnswer_aplusa_teilnehmer();
		boolean answer_aplusa_referent = verbundprojekt.isAnswer_aplusa_referent();
		
		String anmerkungen = verbundprojekt.getAnmerkungen();
		
		PersistenceManager pm = getPersistenceManager();
		try{
			pm.makePersistent(new VerbundprojektServer(name, answer_praeview_ja, answer_gfa_f_ja, answer_gfa_h_ja,
					answer_gfa_f_teilnehmer, answer_gfa_f_referent, answer_gfa_h_teilnehmer, answer_gfa_h_referent,
					answer_bcc_ja,
					answer_bcc_teilnehmer, answer_bcc_referent,
					answer_aplusa_ja,
					answer_aplusa_teilnehmer,
					answer_aplusa_referent,
					anmerkungen
					));
		} finally {
			pm.close();
		}
	}
	
	private PersistenceManager getPersistenceManager() {
		return PMF.getPersistenceManager();
	}


	
}	
